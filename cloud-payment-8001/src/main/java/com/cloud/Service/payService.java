package com.cloud.Service;

import com.cloud.Mapper.payMapper;
import com.cloud.Bean.payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class payService {
    @Autowired
    private payMapper mappers;
    public int add (int num,double price){
        return mappers.add(num,price);
    }
    public payment findbyid(Integer id)
    {
        return mappers.findbyid(id);
    }
}
