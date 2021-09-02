package com.cloud.projo;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class LB implements LoadBalancer {
    private AtomicInteger atomicInteger=new AtomicInteger(0);
    public final int getandadd(){
        int current;
        int next;
        do {
            current=this.atomicInteger.get();
            next=current>=0x3f3f3f3f?0:current+1;
        }while(!this.atomicInteger.compareAndSet(current,next));
        System.out.println("***next:"+next);
        return next;
    }
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int num=getandadd()%serviceInstances.size();
        return serviceInstances.get(num);
    }
}
