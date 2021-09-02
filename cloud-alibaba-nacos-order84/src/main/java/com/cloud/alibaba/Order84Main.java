package com.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Order84Main {
    public static void main(String[] args) {
        SpringApplication.run(Order84Main.class,args);
    }
}
