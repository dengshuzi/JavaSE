package cn.com.dhc4;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午8:59
 * @Description: cn.com.dhc4
 * 1. 类是类接口是接口, 是同一层次的概念
 * 2. 接口中没有构造器
 * 3. 接口如何声明: interface
 * 4. 在JDK1.8之前, 接口中只有两部分内容:
 *  (1)常量: 固定修饰符: public static final
 *  (2)抽象方法: 固定修饰符: public abstract
 * 注意: 修饰符可以省略不写, IDE会帮你自动不全, 但是初学着建议写上, 防止遗忘
 * @version: 1.0
 */
public interface TestInterface01 {
    // 常量:
    /*public static final*/ int NUM = 10;

    // 抽象方法:
    /*public abstract*/ void a();
    /*public abstract*/ void b(int num);
    /*public abstract*/ int c(String name);
}
interface TestInterface02 {
    void e();
    void f();
}
/**
 * 5. 类和接口的关系是什么? 实现关系 类实现接口
 * 6. 一旦实现一个接口, 那么实现类要重写接口中的全部的抽象方法:
 * 7. 如果没有全部重写抽象方法, 那么这个类可以变成一个抽象类
 * 8. java只有单继承, java还有多实现
 * 一个类继承其他类, 只能直接继承一个父类
 * 但是实现类实现接口的话, 可以实现多个接口
 * 9. 写法: 先继承 再实现: Student extends Person implements TestInterface01, TestInterface02
 */
class Student extends Person implements TestInterface01, TestInterface02 {
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b(int num) {
        System.out.println("b");
    }

    @Override
    public int c(String name) {
        return 100;
    }

    @Override
    public void e() {
        System.out.println("e");
    }

    @Override
    public void f() {
        System.out.println("f");
    }
}
class Test {
    public static void main(String[] args) {
        // 10. 接口不能创建对象
//        TestInterface02 t = new TestInterface02();
        TestInterface02 t = new Student(); // 接口指向实现类 --> 多态

        // 11. 接口中常量如何访问
        System.out.println(TestInterface01.NUM);
        System.out.println(Student.NUM);
        Student student = new Student();
        System.out.println(student.NUM);
        TestInterface01 t2 = new Student();
        System.out.println(t2.NUM);
    }
}