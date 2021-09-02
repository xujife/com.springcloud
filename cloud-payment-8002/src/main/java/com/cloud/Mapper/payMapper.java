package com.cloud.Mapper;

import com.cloud.Bean.payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface payMapper {
    public int add(@Param("num") int num, @Param("price") double price);
    public payment findbyid(Integer id);
}
