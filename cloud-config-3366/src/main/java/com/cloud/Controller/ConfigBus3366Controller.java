package com.cloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigBus3366Controller {
    @Value("${server.port}")
    private String ss;
    @Value("${spring}")
    private String name;
    @RequestMapping("/configss")
    public String get(){
        return "port:"+ss+name;
    }
}
