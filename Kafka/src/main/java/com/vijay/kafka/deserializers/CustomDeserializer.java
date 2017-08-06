/**
 * 
 */
package com.vijay.kafka.deserializers;

import java.io.IOException;
import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vijay.request.model.RequestDTO;

/**
 * @author Vijay kiran
 *
 */
public class CustomDeserializer implements Deserializer<RequestDTO> {

	ObjectMapper mapper = null;

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub
		mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	@Override
	public RequestDTO deserialize(String topic, byte[] data) {
		RequestDTO dto = null;
		try {
			dto = mapper.readValue(data, RequestDTO.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
