package com.cloud.Handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderConsulController {
    public static final String url="http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/consumer/payment/consul")
    public String getinfo(){
        return restTemplate.getForObject(url+"/payment/consul",String.class);
    }
}
