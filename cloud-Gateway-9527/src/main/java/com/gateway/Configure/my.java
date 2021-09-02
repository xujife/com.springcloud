package com.gateway.Configure;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class my {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder route=builder.routes();
        route.route("path_4399",l->l.path("/198637.htm").uri("http://www.4399.com/flash/198637.htm")).build();
     return route.build();
    }
}
