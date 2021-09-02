package com.cloud.service.Imp;

import com.cloud.service.MessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)
public class ProviderImp implements MessageProvider {
    @Resource
    private MessageChannel output;
    @Override
    public String send() {
        String message= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(message).build());
        System.out.println("/***"+message+"/");
        return null;
    }
}
