package com.cn.dhc4;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午3:29
 * @Description: com.cn.dhc4
 * @version: 1.0
 */
public class Person {
    int age;
    String name;
    double height;
    public Person() {
    }
    public Person(int age, String name, double height) {
        this(age, name);
        this.height = height;
    }
    public Person(int age, String name) {
        this(age);
        this.name = name;
    }
    public Person(int age) {
        this.age = age;
    }
    /*public void eat() {
        int age = 10;
        System.out.println(age); // 就近原则, age指的是离他近的age ---> 局部变量的age
        System.out.println(this.age); // 这里指代的就是属性的age
        System.out.println("吃");
    }*/
    public void play() {
        /*this.*/eat();
        System.out.println("上网");
        System.out.println("洗澡");
    }
    public void eat() {
        System.out.println(/*this.*/age);
        System.out.println("吃饭");
    }
}
