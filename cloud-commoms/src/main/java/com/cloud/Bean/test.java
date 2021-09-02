package com.cloud.Bean;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       int n,sum=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       if(n<0) System.out.println("输入的数据有错误");
        else {
           for (int i = 1; i <= n; i++) {
               sum += i;
           }
           System.out.println(sum);
       }
    }
}
