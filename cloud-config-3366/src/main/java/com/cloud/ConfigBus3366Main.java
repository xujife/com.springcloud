package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigBus3366Main {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBus3366Main.class,args);
    }
}
