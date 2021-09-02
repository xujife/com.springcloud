package com.cloudalibaba.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class provider {
    @Value("${server.port}")
    private String ss;
    @GetMapping("/payment/nacos")
    public String getSs(){
        return "port:"+ss+" \t"+ UUID.randomUUID().toString();
    }
}
