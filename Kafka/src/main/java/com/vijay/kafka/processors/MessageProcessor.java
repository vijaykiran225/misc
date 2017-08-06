package com.vijay.kafka.processors;

import com.vijay.elastic.writers.ElasticWriter;
import com.vijay.request.model.RequestDTO;

public class MessageProcessor {

	private ElasticWriter  writer=new ElasticWriter();
	
	public void process(RequestDTO value) {
//		if(value!=null)
			writer.write(value);
	}

}
