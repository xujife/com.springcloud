package com.cloud.Controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {
    @GetMapping("/testA")
    public String testA(){
        return "---testA";
    }
    @GetMapping("/testB")
    public String testB(){

        System.out.println(Thread.currentThread().getName()+" \t"+"testB");
        return "---testB";
    }
    @GetMapping("/testC")
    public String testC(){
        return "---testC";
    }
    @GetMapping("/testD")
    public String testD(){
        return "---testD";
    }
    @GetMapping("/testE")
    public String testE(){
        int a=10/0;
        return "---testE";
    }
    @GetMapping("/testhot")
    @SentinelResource(value ="testhot",blockHandler = "deal_hot")
    public String testhot(@RequestParam(value="p1",required = false)String p1,
                          @RequestParam(value="p2",required = false)String p2){
        return "testhot";
    }
    public String deal_hot(String p1, String p2,BlockException exception){
        return "mytest_hot";
    }
}
