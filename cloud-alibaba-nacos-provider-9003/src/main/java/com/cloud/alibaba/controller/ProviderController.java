package com.cloud.alibaba.controller;

import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProviderController {
    @Value("${server.port}")
    private String ss;
    public static HashMap<Long, payment> hashMap=new HashMap<>();
    static {
        hashMap.put(1L,new payment(1,1,1));
        hashMap.put(2L,new payment(2,2,2));
        hashMap.put(3L,new payment(3,3,3));
    }
    @GetMapping("/payment/sql/{id}")
    public Message<payment> sql(@PathVariable("id")long id){
        payment pay=hashMap.get(id);
        Message<payment>ms=new Message(200,"port:"+ss,pay.toString());
        return ms;
    }
}
