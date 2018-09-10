package org.adsoft.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
@EnableConfigServer
public class ConfigurationServerBoot {

	public static void main(String[] args) {
		
		SpringApplication.run(ConfigurationServerBoot.class, args);

	}

}
