package cn.com.dhc5;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午9:47
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public interface TestInterface2 {
    // 常量
    public static int NUM = 10;
    // 抽象方法
    public abstract void a();
    // 非抽象方法
    public default void b() {
        System.out.println("TestInterface2---b");
    }
    // 静态方法
    public static void c() {
        System.out.println("TestInterface2---static");
    }
}
class Demo implements TestInterface2{
    @Override
    public void a() {
        System.out.println("重写a方法");
    }
    public static void c() {
        System.out.println("Demo---static");
    }
}
class A {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.c();
        Demo.c();
        TestInterface2.c();
    }
}