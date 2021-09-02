package com.cloud.alibaba.Controller;

import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import com.cloud.alibaba.Service.FeignServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private FeignServices feignServices;
    @GetMapping("/consumer/payment/sql/{id}")
    public Message<payment> get(@PathVariable("id")long id){
        return feignServices.sql(id);
    }
}
