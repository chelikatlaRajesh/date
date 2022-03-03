package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("security")
public class configurations {

	@Value("${port}")
	private String port;
	
	
	public String server() {
		return port;
		
	}
}
