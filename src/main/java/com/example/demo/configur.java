package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("ok")
public class configur {

	@Value("${portable.number}")
	private String portable;
	

	public String server() {
		return portable;
		
	}
}
