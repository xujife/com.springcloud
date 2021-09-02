package com.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9001Main {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9001Main.class,args);
    }
}
