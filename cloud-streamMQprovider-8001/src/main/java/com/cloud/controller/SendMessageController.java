package com.cloud.controller;

import com.cloud.service.MessageProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {
    @Resource
    private MessageProvider messageProvider;
    @RequestMapping("/send")
    public String send(){
        return messageProvider.send();
    }
}
