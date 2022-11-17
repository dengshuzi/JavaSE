package cn.com.dhc.io04;

import java.io.PrintStream;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/17 - 下午8:06
 * @Description: cn.com.dhc.io04
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        // 写到控制台上:
        PrintStream out = System.out;
        // 调用方法：
        out.print("你好1"); // 直接在控制台写出, 但是不换行
        out.print("你好2");
        out.print("你好3");
        out.print("你好4");
        System.out.println();
        out.println("Hello1"); // 直接在控制台写出, 并且换行操作
        out.println("Hello2");
        out.println("Hello3");
        out.println("Hello4");
    }
}
