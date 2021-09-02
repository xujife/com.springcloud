package com.cloud.Controller;

import com.cloud.Service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderHystrixController {
    @Autowired
    private OrderService orderService;
    @Value("${server.port}")
    private String ss;

    @GetMapping("/payment/ok/{id}")
    public String info(@PathVariable("id")int id){
        return orderService.paymentinfo(id);
    }
    @GetMapping("/payment/timeout/{id}")
    @HystrixCommand(defaultFallback = "DealWith",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String timeout(@PathVariable("id")int id)
    {
        return orderService.timeout(id);
    }
    public String DealWith(){
        return "thread"+Thread.currentThread().getName()+"\t"+"运行异常或超时";
    }
    @GetMapping("/payment/circuit/{id}")
    public String paymentcircuit(@PathVariable("id")int id){
        String result=orderService.paymentcircuitBreaker(id);
        log.info("***result:"+result);
        return result;
    }
}
