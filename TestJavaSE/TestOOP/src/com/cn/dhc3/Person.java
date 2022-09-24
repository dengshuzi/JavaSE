package com.cn.dhc3;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午1:46
 * @Description: com.cn.dhc2
 * @version: 1.0
 */
public class Person {
    // 属性
    String name;
    int age;
    double height;

    // 构造器: 没有任何参数的构造器我们叫做: 无参构造器
    public Person() {
    }
    public Person(String name, int age, double height) {
        // 当形参名字和属性名字重名的时候, 会出现就近原则:
        // 在要表示对象的属性前加上this.来修饰, 因为this代表的就是你创建的哪个对象
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法
    /**
    * 功能描述: 吃
    * @param:
    * @return: null
    * @auther: Evin_D
    * @date: 2022/9/24 - 下午1:47
     */
    public void eat() {
        System.out.println("吃");
    }
}
