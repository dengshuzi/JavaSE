package com.cn.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午1:47
 * @Description: com.cn.dhc2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个Person类的具体对象/实例/实体:
        /**
         * 创建对象的过程
         * 1. 第一次遇到Person的时候, 进行类的加载(只加载一次)
         * 2. 创建对象, 为这个对象在堆中开辟空间
         * 3. 为对象进行属性的初始化动作
         * new关键字实际上是在调用一个方法, 这个方法叫构造方法(构造器)
         * 调用构造器的时候, 如果你的类中没有写构造器, 那么系统会默认给你分配一个构造器, 只是我们看不到罢了
         * 可以自己显示的将构造器编写出来
         * 构造器的格式:
         * [修饰符] 构造器的名字() {
         *
         * }
         * 构造器和方法的区别:
         * 1. 没有方法的返回值类型
         * 2. 方法体内部不能有return语句
         * 3. 构造器的名字很特殊, 必须跟类名一样
         * 构造器的作用: 不是为了创建对象, 因为在调用构造器前, 这个对象就已经创建好了, 并且属性有默认的初始化的值调用构造器的目的时给属性进行赋值操作的
         * 注意: 我们一般不会在空构造器中进行初始化操作, 因为那样的话每个对象的属性就一样了
         * 实际上, 我们只要保证空构造器的存在就可以了, 里面的东西不用写
         */
        Person person = new Person();
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(person.height);

        Person person1 = new Person();
        System.out.println(person1.age);
        System.out.println(person1.name);
        System.out.println(person1.height);

    }
}
