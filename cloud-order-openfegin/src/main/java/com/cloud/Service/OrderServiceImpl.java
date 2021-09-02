package com.cloud.Service;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public String info(int id) {
        return "info：服务已经待机，稍后再试";
    }

    @Override
    public String timeout(int id) {
        return "timeout:服务已经待机，稍后再试";
    }
}
