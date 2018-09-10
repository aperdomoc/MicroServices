package org.adsoft.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PrivateMicroserviceBoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(PrivateMicroserviceBoot.class, args);
	}

}
