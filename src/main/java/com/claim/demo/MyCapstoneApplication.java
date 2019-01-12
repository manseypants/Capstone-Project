package com.claim.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.claim")
@SpringBootApplication
public class MyCapstoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCapstoneApplication.class, args);
	}
}
