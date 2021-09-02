package com.cloud;


public class test {
    public static void main(String[] args) {
      int a[]=new int[]{-10,2,3,246,-100,0,5},sum=0,min=0x3f3f3f3f,max=0,avg;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>max) max=a[i];
            if (a[i]<min) min=a[i];
            sum+=a[i];
        }
        avg=sum/a.length;
        System.out.println(avg+" "+min+" "+max);
    }
}
