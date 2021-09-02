package com.cloud;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    static class Players{
        private static int sum=0;

        public Players() {
        }
        public static Players create(){
            if (sum>=11){
                System.out.println("已创建11个对象，不能在创建");
                sum++;
                return null;
            }
            else{
                sum++;
                System.out.println("创建一个对象");
                return new Players();
            }
        }
    }
    static class Vehicle{
        private String brand;
        private String color;
        private double speed;
        final double num=0;
        public Vehicle(String brand, String color) {
            this.brand = brand;
            this.color = color;
            this.speed = num;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
        public void run(){
            System.out.println(this.brand+" "+this.color+" "+this.speed);
        }
    }
    static class Car extends Vehicle{
        private int loader;

        public Car(String brand, String color, int loader) {
            super(brand, color);
            this.loader = loader;
        }

        @Override
        public void run() {
            System.out.println(this.loader+" "+super.getSpeed()+" "+super.getBrand()+" "+super.getColor());
        }
    }
    static abstract class Shape{
        private double area;
        private double per;
        private String color;

        public Shape(double area, double per, String color) {
            this.area = area;
            this.per = per;
            this.color = color;
        }

        public Shape(String color) {
            this.color = color;
        }

        public abstract double getArea();
        public abstract double getPer();
        public abstract  void showAll();
        public void getColor(){
            System.out.println(this.color);
        }
    }
    static  class Rectange extends Shape{
        private int width;
        private int height;

        public Rectange(String color, int width, int height) {
            super(color);
            this.width = width;
            this.height = height;
        }

        public Rectange(double area, double per, String color) {
            super(area, per, color);
        }

        @Override
        public double getArea() {
            return this.height*this.width;
        }

        @Override
        public double getPer() {
            return 2*(this.height+this.width);
        }

        @Override
        public void showAll() {
            System.out.println(this.height+" "+this.width);
        }
    }
    static class Circle extends Shape{
        private double r;

        public Circle(String color, double r) {
            super(color);
            this.r = r;
        }

        public Circle(double area, double per, String color, double r) {
            super(area, per, color);
            this.r = r;
        }

        @Override
        public double getArea() {
            return 3.14*r*r;
        }

        @Override
        public double getPer() {
            return 2*3.14*r;
        }

        @Override
        public void showAll() {
            System.out.println(this.r+" "+this.getArea()+" "+this.getPer());
        }
    }
    static class Fruit{
    }
    static class Apple extends Fruit{

    }
    static  class Pear extends Fruit{

    }
    static class Orange extends Fruit{

    }
    static class Student{
        private String name;
        private int age;
        private String id;
        private String sex;

        public Student(String name, int age, String id, String sex) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.sex = sex;
        }
    }
    static class English extends Student{
        private int a;
        private int b;
        private int c;

        public English(String name, int age, String id, String sex, int a, int b, int c) {
            super(name, age, id, sex);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public English(String name, int age, String id, String sex) {
            super(name, age, id, sex);
        }
    }
    static class computer extends Student{
        private int d;
        private int e;
        private int f;

        public computer(String name, int age, String id, String sex) {
            super(name, age, id, sex);
        }

        public computer(String name, int age, String id, String sex, int d, int e, int f) {
            super(name, age, id, sex);
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    static class Chinese extends Student{
        private int h;
        private int i;
        private int j;
        private int k;

        public Chinese(String name, int age, String id, String sex, int h, int i, int j, int k) {
            super(name, age, id, sex);
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
        }
    }

    public static void main(String[] args) {
        Student students[]=new Student[5];
        Random r=new Random();
        students[0]=new Student("xu",23,"001","男");
        students[1]=new Student("wang",22,"002","男");
        students[2]=new Student("li",23,"003","男");
        students[3]=new Student("liu",23,"004","男");
        students[4]=new Student("hu",23,"005","男");
        int num=80;
        for (int i = 0; i < 5; i++) {
            System.out.println("学号：" + students[i].id + " 姓名：" + students[i].name + " 年龄：" + students[i].age + " 性别：" + students[i].sex
                    + " 综合成绩：" + (num+r.nextInt(10)));
        }
        Scanner sc=new Scanner(System.in);
        sc.next();
        Apple apple=new Apple();
        System.out.println("创建了一个苹果对象");
        System.out.println("________________");
        Rectange rectange=new Rectange("red",1,2);
        rectange.showAll();
        System.out.println("****************");
        Circle circle=new Circle("black",1);
        circle.showAll();
        System.out.println("_______________");
        Car car=new Car("Honda","red",2);
        car.run();
        System.out.println("*********");
        Vehicle vehicle=new Vehicle("benz","black");
        vehicle.run();
        System.out.println("___________");
        Players players[]=new Players[13];
        for (int i = 0; i < 12; i++) {
            players[i]=Players.create();
            //System.out.println(Players.sum);
        }
    }
}
