package com.cloud.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class payment {
    private Integer id;
    private int num;
    private  double price;
    public payment(int num,double price) {
        this(null, num, price);
    }
}
