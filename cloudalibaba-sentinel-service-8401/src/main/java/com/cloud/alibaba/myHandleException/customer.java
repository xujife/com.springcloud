package com.cloud.alibaba.myHandleException;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.Bean.Message;

public class customer {
    public static Message way1(BlockException exception){
        return new Message(400,"用户定义1",null);
    }
    public static Message way2(BlockException exception){
        return new Message(400,"用户定义2",null);
    }
    public static  Message handleException(BlockException exception){
        return new Message(444,"运行异常",exception.getClass().getName());
    }
}
