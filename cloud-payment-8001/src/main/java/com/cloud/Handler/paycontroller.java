package com.cloud.Handler;

import com.cloud.Service.payService;
import com.cloud.Bean.Message;
import com.cloud.Bean.payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class paycontroller {
    @Autowired
    payService service;
    @Value("${server.port}")
    private  String ss;
    @Autowired
    private DiscoveryClient discoveryClient;
    @PostMapping("/pay/add")
    public Message add(payment pay)
    {
        int result=service.add(pay.getNum(),pay.getPrice());
        log.info("**result:"+result);
        if(result>0)
        {
            return new Message(200,result,"success,serverport:"+ss);
        }
        else return  new Message(404,result,"failed");
    }
    @GetMapping("/find/{id}")
    public Message add(@PathVariable("id")Integer id)
    {
        payment pay=service.findbyid(id);
        log.info("**result"+pay);
        if(pay!=null)
        {
            return new Message(200,pay,"success,serverport:"+ss);
        }
        else return  new Message(404,pay,"failed");
    }
    @GetMapping("/payment/discovery")
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
        return this.discoveryClient;
    }
    @GetMapping("/payment/lb")
    public String getlb(){
        return ss;
    }
    @GetMapping("/payment/timeout")
    public String paymenttimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return ss;
    }
    @GetMapping("/payment/zipkin")
    public String getzipkin(){
        return "zikpin";
    }
}
