package com.cloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableBinding(Sink.class)
public class my {
    @Value("${server.port}")
    private String ss;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> m)
    {
        System.out.println("消费者一号 port:"+ss+" 内容："+m.getPayload());
    }
}
