package com.cn.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午1:46
 * @Description: com.cn.dhc2
 * @version: 1.0
 */
public class Person {
    // 构造器: 没有任何参数的构造器我们叫做: 无参构造器
    public Person() {
        /*age = 19;
        name = "张三";
        height = 170.0;*/
    }
    // 属性
    String name;
    int age;
    double height;

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
