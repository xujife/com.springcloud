package com.cloud.alibaba.Block;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.Bean.Message;

public class myblock {
    public static Message ratelimit(long id, BlockException e){
        return new Message((int)id,"blockException 流量控制",e.getClass().getName());
    }
}
