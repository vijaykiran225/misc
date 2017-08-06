package com.vijay.http;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import com.vijay.config.BaseConfig;

public class HttpCaller {

	public void call() {
		String protocol = BaseConfig.getConfig().getString("es_protocol");
		String host = BaseConfig.getConfig().getString("es_host");
		String port = BaseConfig.getConfig().getString("es_port");
		String targetIndex = BaseConfig.getConfig().getString("es_index");

		WebTarget webTarget = ClientBuilder.newClient().target(buildUrl(protocol, host, port)).path(targetIndex);
		Response resp = webTarget.path("").request().get();
		System.err.println("called");
	}

	public String buildUrl(String protocol, String host, String port) {
		if (StringUtils.isNotBlank(protocol) 
				&& StringUtils.isNotBlank(host) 
				&& StringUtils.isNotBlank(port))
			return protocol+"://"+host+":"+port+"/";
		else
			return null;
	}
}
