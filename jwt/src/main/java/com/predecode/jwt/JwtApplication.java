package com.predecode.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class JwtApplication {

	static final Logger logger = LoggerFactory.getLogger(JwtApplication.class);

	public static void main(String[] args) {
		logger.info("Application Start....");
		SpringApplication.run(JwtApplication.class, args);
	}
	
}
