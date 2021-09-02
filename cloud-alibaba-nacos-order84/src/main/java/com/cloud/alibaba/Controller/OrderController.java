package com.cloud.alibaba.Controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cloud.Bean.Message;
import com.cloud.alibaba.Block.myblock;
import com.cloud.alibaba.myfallback.myfallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Value("${service-url.nacos-user-service}")
    private String url;
    @Autowired
    private RestTemplate restTemplate;
    @SentinelResource(value ="consumer",fallbackClass = myfallback.class,
    fallback = "handleException",blockHandlerClass = myblock.class,
    blockHandler = "ratelimit")
    @GetMapping("/consumer/payment/sql/{id}")
    public Message get(@PathVariable("id")long id){
        if (id==4){
            throw new IllegalArgumentException("非法参数异常");
        }else if(id>4){
            throw new NullPointerException("无对应的记录");
        }
        return restTemplate.getForObject(url+"/payment/sql/"+id,Message.class,id);
    }
}
