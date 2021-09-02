package com.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Consumer83Main {
    public static void main(String[] args) {
        SpringApplication.run(Consumer83Main.class,args);
    }
}
