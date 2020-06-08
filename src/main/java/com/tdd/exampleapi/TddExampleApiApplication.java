package com.tdd.exampleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TddExampleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddExampleApiApplication.class, args);
	}

}
