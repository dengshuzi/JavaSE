package com.cn.dhc;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 上午11:44
 * @Description: com.cn.dhc
 * @version: 1.0
 */
public class Test { // 测试类
    // 这是一个main方法, 是程序的入口
    public static void main(String[] args) {
        // 创建一个人类的具体的对象/实例
        // 创建一个对象, 对象的名字叫:person
        // Person属于引用数据类型
        // 第一次加载类的时候, 会进行类的加载, 初始化创建对象的时候, 对象的属性没有给赋值, 有默认的初始化的值
        Person person = new Person();
        person.name = "张三";
        person.age = 19;
        person.height = 170.0;
        person.weight = 155.0;

        // 再创建一个对象
        // 再次创建类的时候, 就不会进行类的加载了, 类的加载只在第一次需要的时候加载一次
        Person person1 = new Person();
        person1.name = "李四";
        person1.age = 20;
        person1.height = 180.0;
        person1.weight = 167.0;

        // 对属性值进行读取:
        System.out.println(person.name);
        System.out.println(person1.age);

        // 对方法进行操作
        // 不同的对象, 属性有自己的特有的值, 但是方法都是调用类中通用的方法
        // 属性: 各个对象的属性是独立的
        // 方法： 各个对象的方法是共享的
        person.eat();
        person1.eat();
        person.sleep("教室");
        System.out.println(person.introduce());
    }
}
