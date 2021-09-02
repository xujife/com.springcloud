package com.cloud.alibaba.Service.Imp;

import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import com.cloud.alibaba.Service.FeignServices;
import org.springframework.stereotype.Component;

@Component
public class FallbackImp implements FeignServices {
    @Override
    public Message<payment> sql(long id) {
        return new Message(444,"服务降级",null);
    }
}
