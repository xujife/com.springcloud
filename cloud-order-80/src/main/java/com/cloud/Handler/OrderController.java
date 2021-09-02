package com.cloud.Handler;

import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import com.cloud.projo.LB;
import com.cloud.projo.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.net.URL;
import java.util.List;

@Slf4j
@RestController
public class OrderController {
    /*public static  final  String PayUrl="http://localhost:8001";*/
    public static  final  String PayUrl="http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private com.cloud.projo.LB LB;
    @Resource
    private DiscoveryClient discoveryClient;
    /*@Resource
    private DiscoveryClient discoveryClient;*/
    @Value("${server.port}")
    private String ss;
    @GetMapping("consumer/find/{id}")
    public Message<payment> add(@PathVariable("id")Integer id)
    {
        return  restTemplate.getForObject(PayUrl+"/find/"+id,Message.class);
    }
    @GetMapping("consumer/pay/add")
    public Message<payment> add(payment payment)
    {
        return  restTemplate.postForObject(PayUrl+"/pay/add",payment,Message.class);
    }
    /*@GetMapping("/payment/discovery")
    public Object discover()
    {
        List<String> services= discoveryClient.getServices();
        for(String str:services){
            log.info("element:"+str);
        }
        List<ServiceInstance>instances=discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance:instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return discoveryClient;
    }*/
    @GetMapping("/consumer/payment/lb")
    public String getpaylb(){
        List<ServiceInstance> instances=discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances==null||instances.size()==0){
            return  null;
        }
        ServiceInstance serviceInstance=LB.instance(instances);
        URI uri=serviceInstance.getUri();
        System.out.println(uri);
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }
    @GetMapping("/consumer/payment/zipkin")
    public String getzipkin(){
        String str=restTemplate.getForObject("http://localhost:8001"+"/payment/zipkin/",String.class);
        return  str;
    }
}
