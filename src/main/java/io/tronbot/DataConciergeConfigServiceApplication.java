package io.tronbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DataConciergeConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataConciergeConfigServiceApplication.class, args);
	}
}
