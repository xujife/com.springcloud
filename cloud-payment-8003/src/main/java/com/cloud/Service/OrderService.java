package com.cloud.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Service
public class OrderService {
    public String paymentinfo(int id){
        return "thread:"+Thread.currentThread().getName()+" success,id:"+id+"\t"+"Ok";
    }
    public String timeout(int id){
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "thread："+Thread.currentThread().getName()+" limit,id :"+id+"\t"+"timeout";
    }
    @HystrixCommand(fallbackMethod = "paymentcircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "50")
    })
    public String paymentcircuitBreaker(@PathVariable("id")int id){
        if(id<0){
            throw new RuntimeException("****id不能为负数");
        }
        String num= UUID.randomUUID().toString();
        return Thread.currentThread().getName()+"\t"+"succeed 流水号："+num;
    }
    public String paymentcircuitBreaker_fallback(@PathVariable("id")int id){
        return "id不能负数，请稍后再试，id："+id;
    }
}
