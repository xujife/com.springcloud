package com.cloudalibaba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String url;
    @GetMapping("/consumer/payment/nacos")
    public String get(){
        return restTemplate.getForObject(url+"/payment/nacos",String.class);
    }
}
