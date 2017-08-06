/**
 * 
 */
package com.vijay.elastic.writers;

import com.vijay.http.HttpCaller;
import com.vijay.request.model.RequestDTO;

/**
 * @author Vijay kiran
 *
 */
public class ElasticWriter {

	private HttpCaller httpCaller=new HttpCaller();

	public void write(RequestDTO value) {
		httpCaller.call();
	}
	
	
}
