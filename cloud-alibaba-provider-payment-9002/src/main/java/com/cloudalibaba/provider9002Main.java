package com.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class provider9002Main {
    public static void main(String[] args) {
        SpringApplication.run(provider9002Main.class,args);
    }
}
