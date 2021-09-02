package com.cloud.alibaba.Service;

import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "alibaba-provider-service")
public interface FeignServices {
    @GetMapping("/payment/sql/{id}")
    public Message<payment> sql(@PathVariable("id")long id);
}
