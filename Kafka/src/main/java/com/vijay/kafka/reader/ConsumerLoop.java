package com.vijay.kafka.reader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;

import com.vijay.kafka.deserializers.CustomDeserializer;
import com.vijay.kafka.processors.MessageProcessor;
import com.vijay.request.model.RequestDTO;

public class ConsumerLoop implements Runnable {
	  private final KafkaConsumer<String, RequestDTO> consumer;
	  private final List<String> topics;
	  private final int id;
	  private MessageProcessor processor=new MessageProcessor();
	  
	
	  public ConsumerLoop(int id,
	                      String groupId, 
	                      List<String> topics) {
	    this.id = id;
	    this.topics = topics;
	    Properties props = new Properties();
	    props.put("bootstrap.servers", "localhost:9092");
	    props.put("group.id", groupId);
	    props.put("key.deserializer", StringDeserializer.class.getName());
	    props.put("value.deserializer", CustomDeserializer.class.getName());
	    this.consumer = new KafkaConsumer<>(props);
	  }
	 
	  @Override
	  public void run() {
	    try {
	      consumer.subscribe(topics);

	      while (true) {
	        ConsumerRecords<String, RequestDTO> records = consumer.poll(Long.MAX_VALUE);
	        for (ConsumerRecord<String, RequestDTO> record : records) {
	          Map<String, Object> data = new HashMap<>();
	          data.put("partition", record.partition());
	          data.put("offset", record.offset());
	          data.put("value", record.value());
	          System.out.println(this.id + ": " + data);
	          processor.process(record.value());
	        }
	      }
	    } catch (WakeupException e) {
	      // ignore for shutdown 
	    } finally {
	      consumer.close();
	    }
	  }

	  public void shutdown() {
	    consumer.wakeup();
	  }
	}

