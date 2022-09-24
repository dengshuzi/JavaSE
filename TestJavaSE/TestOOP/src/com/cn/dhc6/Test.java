package com.cn.dhc6;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午5:45
 * @Description: com.cn.dhc6
 * @version: 1.0
 */
public class Test {
    // 属性
    int a;
    static int sa;

    // 方法
    public void a() {
        System.out.println("方法a");
        {
            // 普通块限制了局部变量的作用范围
            System.out.println("普通块");
            int num = 10;
            System.out.println(num);
        }
    }
    public static void b() {
        System.out.println("方法b");
    }
    // 构造块
    {
        System.out.println("构造块");
    }
    // 静态块
    static{
        // 在静态块中只能访问: 静态属性, 静态方法
        System.out.println("静态块");
        System.out.println(sa);
        b();
    }
    // 构造器
    public Test() {
        System.out.println("这是空构造器");
    }
    public Test(int a) {
        this.a = a;
    }
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.a();

        Test test2 = new Test();
        test2.a();
    }
}
