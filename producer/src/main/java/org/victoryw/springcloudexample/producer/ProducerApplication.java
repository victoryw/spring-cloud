package org.victoryw.springcloudexample.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class ProducerApplication {

	@Value("${config-test}")
	String configTest;

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
}
