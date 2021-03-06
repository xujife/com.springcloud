package com.cloud;

import java.util.Scanner;

public class test {
    static class Book{
        private String num;
        private String isbn;
        private String name;
        private double price;
        private String date;

        public Book(String num, String isbn, String name, double price, String date) {
            this.num = num;
            this.isbn = isbn;
            this.name = name;
            this.price = price;
            this.date = date;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return
                    "num='" + num + '\'' +
                    ", isbn='" + isbn + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", date='" + date + '\'' +
                    '}';
        }
    }
    static class Cat{
        private int age;
        private String color;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Cat(int age, String color) {
            this.age = age;
            this.color = color;
        }

        @Override
        public String toString() {
            return "????????????" + age +
                    ", ??????'" + color + '\'';
        }
    }
    static class Teacher{
        private String name;
        private int age;
        private String content;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
        public void eat(){
            System.out.println("?????????"+this.age+"???"+this.name+"????????????????????????");
        }
        public void teach(){
            System.out.println("?????????"+this.age+"???"+this.name+this.content);
        }

        public Teacher(String name, int age, String content) {
            this.name = name;
            this.age = age;
            this.content = content;
        }
    }
    static class Student{
        private String name;
        private int age;
        private String content;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
        public void eat(){
            System.out.println("?????????"+this.age+"???"+this.name+"????????????????????????");
        }
        public void study(){
            System.out.println("?????????"+this.age+"???"+this.name+"??????????????????"+this.content);
        }

        public Student(String name, int age, String content) {
            this.name = name;
            this.age = age;
            this.content = content;
        }
    }
    static class Coder{
        private String name;
        private String id;
        private double salary;

        public Coder(String name, String id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public void intro(){
            System.out.println("???????????????:"+this.name);
            System.out.println("?????????"+this.id);
        }
        public void showSalary(){
            System.out.println("???????????????"+this.salary+",?????????");
        }
        public void work(){
            System.out.println("????????????????????????......");
        }
    }
    static class Manager{
        private String name;
        private String id;
        private String salary;

        public Manager(String name, String id, String salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSalary() {
            return salary;
        }

        public void setSalary(String salary) {
            this.salary = salary;
        }
        public void intro(){
            System.out.println("????????????:"+this.name);
            System.out.println("?????????"+this.id);
        }
        public void showSalary(){
            System.out.println("???????????????"+this.salary+",??????3000");
        }
        public void work(){
            System.out.println("?????????????????????????????????????????????");
        }
    }
    static class Card{
        private String color;
        private int num;

        public Card(String color, int num) {
            this.color = color;
            this.num = num;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
        public void show(){
            System.out.println(this.color+this.num);
        }
    }
    static class MyDate{
        private String year;
        private String month;
        private String day;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public MyDate(String year, String month, String day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        public void showDate(){
            System.out.println("?????????"+this.year+"???"+this.month+"???"+this.day+"???");
        }
        public void isBi(){
            int y=Integer.parseInt(this.year);
            if ((y%400==0)||(y%4==0&&y%100!=0)){
                System.out.println(this.year+"????????????");
            }
            else System.out.println(this.year+"???????????????");
        }
    }
    static class  Circle{
        private double r;

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }

        public Circle(double r) {
            this.r = r;
        }
        public void showArea(){
            System.out.println("????????????"+r+",????????????"+3.14*r*r);
        }
        public  void show(){
            System.out.println("????????????"+r+",????????????"+3.14*2*r);
        }
    }
    public static void main(String[] args) {
        Circle circle=new Circle(8);
        circle.showArea();
        circle.show();
        System.out.println("_____________________");
        MyDate myDate=new MyDate("1900","1","1");
        myDate.showDate();
        myDate.isBi();
        System.out.println("_____________________");
        Card card=new Card("??????",2);
        card.show();
        System.out.println("_____________________");
        Manager manager=new Manager("James","9527","15000");
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("****************");
        Coder coder=new Coder("Kobe","0025",10000);
        coder.intro();
        coder.showSalary();
        coder.work();
        System.out.println("_____________________");
        Teacher t=new Teacher("?????????",30,"java????????????");
        t.eat();
        t.teach();
        Student s=new Student("?????????",18,"java????????????");
        s.eat();
        s.study();
        System.out.println("_____________________");
       Cat cats[]=new Cat[4];
        cats[0]=new Cat(5,"???");
        cats[1]=new Cat(5,"???");
        cats[2]=new Cat(3,"???");
        cats[3]=new Cat(3,"???");
        System.out.println(cats[0]);
        System.out.println(cats[1]);
        System.out.println("???????????????"+cats[0].equals(cats[1]));
        System.out.println("**************");
        System.out.println(cats[2]);
        System.out.println(cats[3]);
        System.out.println("???????????????"+!cats[2].equals(cats[3]));
        System.out.println("_____________________");
        Book books[]=new Book[4];
        int index=0;
        double max=0;
        for (int i = 0; i <3 ; i++) {
            books[i]=new Book("No003","isbn387648797524","JavaWeb??????",58.8,"2017-01-01");
            if (max<books[i].getPrice())
            {
                max=books[i].getPrice();
                index=i;
            }
        }
        System.out.println("???????????????"+books[index].toString());
    }

}
