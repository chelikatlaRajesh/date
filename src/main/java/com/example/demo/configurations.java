package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurations {

	@Value("${port=5465}")
	private String portable;
	
	@Bean
	public String server() {
		return portable;
		
	}
}
