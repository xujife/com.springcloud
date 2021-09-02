package com.cloudalibaba.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class providerController {
    @Value("${server.port}")
    private String ss;
    @GetMapping("/payment/nacos")
    public String getSs(){
        return "port:"+ss+"\t id:"+ UUID.randomUUID().toString();
    }
}
