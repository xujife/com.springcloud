package com.cloud.Service;

import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "ORDER-HYSTRIXPAYMENT-SERVICE",fallback = OrderServiceImpl.class)
public interface OrderService {
    @GetMapping("/payment/ok/{id}")
    public String info(@PathVariable("id")int id);
    @GetMapping("/payment/timeout/{id}")
    public  String timeout(@PathVariable("id")int id);

}
