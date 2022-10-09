package cn.com.dhc5;

import cn.com.dhc4.TestInterface01;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午9:37
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public interface TestInterface {
    // 常量:
    public static final int NUM = 10;
    // 抽象方法:
    public abstract void a();
    // public default修饰的抽象方法:
    public default void b() {
        System.out.println("TestInterface   b()");
    }
}
class Test implements TestInterface {
    public void c() {
        b(); // 可以
//        super.b(); 不可以
        TestInterface.super.b(); // 可以
    }
    @Override
    public void a() {
        System.out.println("重写了a方法");
    }
    @Override
    public void b() {
        System.out.println("重写了b方法");
    }
}
