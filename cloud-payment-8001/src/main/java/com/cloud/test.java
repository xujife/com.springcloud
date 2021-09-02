package com.cloud;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
       // System.out.println();
        test.test6();
        //System.out.println();
        test.test7();
    }
    public static void test1(){
        int[] ints={10,20,30,40,50,60,66,70,80,99};
        System.out.println("您的大乐透号码为：");
        for (int i=0;i<ints.length;i++)
            System.out.print(ints[i]+" ");
    }
    public static void test2(){
        Object[] object = { " ",
                "黑桃A", "黑桃2", "黑桃3", "黑桃4", "黑桃5", "黑桃6", "黑桃7", "黑桃8", "黑桃9", "黑桃10", "黑桃j", "黑桃q", "黑桃K",
                "红桃A", "红桃2", "红桃3", "红桃4", "红桃5", "红桃6", "红桃7", "红桃8", "红桃9", "红桃10", "红桃J", "红桃Q", "红桃K",
                "梅花A", "梅花2", "梅花3", "梅花4", "梅花5", "梅花6", "梅花7", "梅花8", "梅花9", "梅花10", "梅花J", "梅花Q", "梅花K",
                "方片A", "方片2", "方片3", "方片4", "方片5", "方片6", "方片7", "方片8", "方片9", "方片10", "方片J", "方片Q", "方片K"
        };
        for (int i=0;i<object.length;i++){
            System.out.print(object[i]+" ");
            if (i%13==0) System.out.println();
        }
    }
    public static void test3() {
        Object[] object = {
                "", "黑桃A", "黑桃2", "黑桃3", "黑桃4", "黑桃5", "黑桃6", "黑桃7", "黑桃8", "黑桃9", "黑桃10", "黑桃j", "黑桃q", "黑桃K",
                "红桃A", "红桃2", "红桃3", "红桃4", "红桃5", "红桃6", "红桃7", "红桃8", "红桃9", "红桃10", "红桃J", "红桃Q", "红桃K",
                "梅花A", "梅花2", "梅花3", "梅花4", "梅花5", "梅花6", "梅花7", "梅花8", "梅花9", "梅花10", "梅花J", "梅花Q", "梅花K",
                "方片A", "方片2", "方片3", "方片4", "方片5", "方片6", "方片7", "方片8", "方片9", "方片10", "方片J", "方片Q", "方片K"
        };
        System.out.print(object[1]+" ");
        System.out.print(object[5]+" ");
        System.out.println(object[50]);
    }

    public static void test4() {
        int[] ints = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int k = getAvg(ints), sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > k) sum++;
        }
        System.out.println("高于平均分：" + k + "的个数有" + sum + " 个");
    }

    public static int getAvg(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++)
            sum += ints[i];
        return sum / ints.length;
    }

    public static void test5(){
        int a[]={1,2,3,4,3,2,1};
        int b[]={1,2,3,4,5,2,1};
        int left=a.length/2;
        int right=b.length/2;
        System.out.println(left);
        int flag=0;
        while(left>=0){
            if(a[left]!=a[right]){
                flag=-1;
                break;
            }
            left--;
            right++;
        }
        if(flag==-1) System.out.println("false");
        else System.out.println(true);

        left=a.length/2;
        right=b.length/2;
        flag=0;
        while(left>=0){
            if(b[left]!=b[right]){
                flag=-1;
                break;
            }
            left--;
            right++;
        }
        if(flag==-1) System.out.println("false");
        else System.out.println(true);
    }
    public static void test6(){
        int a[] = {1,2,3,4,3,2,1};
        int b[] = {1,2,3,4,3,2,1};
        int flag=0;
        for(int i=0;i<=6;i++){
            if(a[i]!=b[i]){
                flag=-1;
                break;
            }
        }
        if(flag==-1) System.out.println("false");
        else System.out.println("true");
    }

    public static void test7(){
        char tmp[] = {'a','l','f','m','f','o','b','b','s','n'};
        int cot[] = new int[30];
        for (char c : tmp) {
            cot[c-'a']++;
        }
        for(int i=0;i<=25;i++){
            char now= (char) (i+'a');
            System.out.println(now+"："+cot[i]);
        }
    }
}
