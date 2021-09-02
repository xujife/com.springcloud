package com.cloud.Handler;

import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import com.cloud.Service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@DefaultProperties(defaultFallback = "Global")
public class OrderHandler {
    @Autowired
    private OrderService orderService;
    @GetMapping("/consumer/find/{id}")
    public String info(@PathVariable("id")int id){
        return orderService.info(id);
    }
    @HystrixCommand(fallbackMethod = "timeouts",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "50000")
    })
    @GetMapping("/consumer/payment/timeout/{id}")
    public  String stringMessage(@PathVariable("id")int id){
        return orderService.timeout(id);
    }
    public String timeouts(@PathVariable("id")int id){
        return "系统繁忙或者连接超时，稍后再尝试！+/(ㄒoㄒ)/~~";
    }
    public String Global(){
        return "Global";
    }
    /*//服务熔断
    @GetMapping("/payment/cricuit/{id}")
    public String paymentcircuit(){

    }*/
}
