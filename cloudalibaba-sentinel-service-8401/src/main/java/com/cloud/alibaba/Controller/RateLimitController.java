package com.cloud.alibaba.Controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import com.cloud.alibaba.myHandleException.customer;
import com.cloud.alibaba.myfallback.fallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {
    @GetMapping("/by")
    @SentinelResource(value = "by",blockHandler = "handleException")
    public Message by(){
        return new Message(200,"按资源名称限流ok",new payment(2020,10,1).toString());
    }
    public Message handleException(BlockException exception){
        return new Message(444,exception.getClass().getName()+"\t 服务不可用","");
    }
    @GetMapping("/byUrl")
    @SentinelResource(value = "url")
    public Message byUrl(){
        return new Message(200,"按url限流ok",null);
    }
    @GetMapping("/myself")
    @SentinelResource(value="myself",
            blockHandlerClass = customer.class,
    blockHandler = "way2")
    public Message customer(){
        return new Message(200,"自定义",null);
    }
    //--------
    @GetMapping("/all")
    @SentinelResource(value = "all",blockHandlerClass = customer.class,
            blockHandler = "handleException",fallbackClass = fallback.class,
        fallback = "fallback1")
    public Message all(){
        int a=10/0;
        return new Message(200,"running",null);
    }
    /*public Message fallback1(Throwable e)
    {
        return new Message(404,"兜底方法",e.getClass().getName());
    }*/
}
