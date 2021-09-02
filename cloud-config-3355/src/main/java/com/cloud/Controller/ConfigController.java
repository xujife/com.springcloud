package com.cloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${spring}")
    private String ss;
    @Value("${info}")
    private String info;
    @RequestMapping("/configss")
    public String get(){
        return ss;
    }
    @RequestMapping("/config/info")
    public String getInfo(){
        return info;
    }

}
