package org.victoryw.springcloudexample.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class ConsumerApplication {
    @Autowired
    private DiscoveryClient discoveryClient;
    private String appName = "testConsulApp";

    @RequestMapping("/instances")
    public List<ServiceInstance> instances() {
        return discoveryClient.getInstances(appName);
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
