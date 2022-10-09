package cn.com.dhc3;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午8:26
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
// 4. 一个类中如果有方法是抽象方法, 那么这个类也要变成一个抽象类
// 5. 一个抽象类中可以有0-n个抽象方法
public abstract class Person {
    // 1. 在一个类中, 会有一个类方法, 子类对这个方法非常满意, 无需重写, 直接使用
    public void eat() {
        System.out.println("吃");
    }
    // 2. 在一个类中, 会有一个类方法, 子类对这个方法永远不满意, 会对这个方法进行重写
    // 3. 一个方法的方法体去掉, 然后被abstract修饰, 那么这个方法就变成了一个抽象方法
    public abstract void say();
    public abstract void sleep();
}
// 6. 抽象类可以被其他类继承
// 7. 一个类继承一个抽象类, 那么这个类可以变成抽象类
// 8. 一般子类不会加abstract修饰, 一般会让子类重写父类中的抽象方法
// 9. 子类继承抽象类, 就必须重写全部的抽象方法
// 10. 子类如果没有重写父类全部的抽象方法, 那么子类也可以编程一个抽象类
class Student extends Person {
    @Override
    public void say() {
        System.out.println("说");
    }

    @Override
    public void sleep() {
        System.out.println("睡");
    }
}
class Demo {
    public static void main(String[] args) {
        // 11. 创建抽象类的对象: --> 抽象类不可以创建对象
//        Person p = new Person();

        // 12. 创建子类对象
        Student s = new Student();
        s.say();
        s.sleep();

        // 13. 多态写法: 父类引用指向子类对象
        Person person = new Student();
        person.say();
        person.sleep();
    }
}
