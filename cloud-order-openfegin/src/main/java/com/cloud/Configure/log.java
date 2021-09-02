package com.cloud.Configure;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class log {
    @Bean
    public Logger.Level getloggerlever(){
        return Logger.Level.FULL;
    }
}

