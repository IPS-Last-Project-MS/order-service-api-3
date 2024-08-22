package com.devops.order_service_api_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceApi3Application {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApi3Application.class, args);
	}

}
