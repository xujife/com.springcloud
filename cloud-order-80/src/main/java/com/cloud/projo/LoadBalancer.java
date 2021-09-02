package com.cloud.projo;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
   public abstract ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
