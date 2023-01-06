package com.infy;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoPostMsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoPostMsApplication.class, args);
	}
}
