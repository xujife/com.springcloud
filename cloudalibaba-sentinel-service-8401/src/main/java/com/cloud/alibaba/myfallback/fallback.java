package com.cloud.alibaba.myfallback;

import com.cloud.Bean.Message;

public class fallback {
    public static Message fallback1(Throwable a){
        return new Message(404,"运行异常",a.getClass().getName());
    }
}
