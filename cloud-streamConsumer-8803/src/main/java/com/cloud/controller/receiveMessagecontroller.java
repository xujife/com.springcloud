package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Sink.class)
public class receiveMessagecontroller {
    @Value("${server.port}")
    private String ss;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message)
    {
        System.out.println("消费者二号 port:"+ss+"内容:"+message.getPayload());
    }
}
