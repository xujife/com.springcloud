package com.cloud.Handler;

import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import com.cloud.Service.payService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class paycontroller {
    @Autowired
    payService service;
    @Value("${server.port}")
    private  String ss;
    @PostMapping("/pay/add")
    public Message add(payment pay)
    {
        int result=service.add(pay.getNum(),pay.getPrice());
        log.info("**result:"+result);
        if(result>0)
        {
            return new Message(200,result,"success,serverport:"+ss);
        }
        else return  new Message(404,result,"failed");
    }
    @GetMapping("/find/{id}")
    public Message add(@PathVariable("id")Integer id)
    {
        payment pay=service.findbyid(id);
        log.info("**result"+pay);
        if(pay!=null)
        {
            return new Message(200,pay,"success,serverport:"+ss);
        }
        else return  new Message(404,pay,"failed");
    }
    @GetMapping("/payment/lb")
    public String getlb(){
        return ss;
    }
}
