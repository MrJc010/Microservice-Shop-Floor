package com.shoopfloor.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoopFloorInitialItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoopFloorInitialItemApplication.class, args);
	}

}
