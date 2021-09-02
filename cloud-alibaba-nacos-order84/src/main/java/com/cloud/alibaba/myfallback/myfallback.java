package com.cloud.alibaba.myfallback;

import com.cloud.Bean.Message;

public class myfallback {
    public static Message handleException(long id,Throwable e){
        return new Message((int)id,"fallbcak",e.getClass().getName());
    }
}
