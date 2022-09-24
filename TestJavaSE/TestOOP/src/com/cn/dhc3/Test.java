package com.cn.dhc3;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午1:47
 * @Description: com.cn.dhc2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 1. 一般保证空构造器的存在, 空构造器中一般不会进行属性的赋值操作
         * 2. 一般我们会重载构造器, 在重载构造器中进行属性赋值
         * 3. 在重载构造器以后, 假如空构造器忘写了, 系统也不会给你分配默认的空构造器了, 那么你要调用的话就会出错了
         * 4. 在要表示对象的属性前加上this.来修饰, 因为this代表的就是你创建的哪个对象
         */
        // 创建一个Person类的具体对象/实例/实体:
        Person person = new Person();
        Person person1 = new Person("zhangsan", 19, 170.0);
        System.out.println(person1.age);
        System.out.println(person1.name);
        System.out.println(person1.height);
    }
}
