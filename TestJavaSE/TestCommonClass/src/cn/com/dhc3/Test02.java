package cn.com.dhc3;

import java.util.Random;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/17 - 下午6:29
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        // 返回带正号的 double 值, 该值大于等于 0.0 且小于 1.0
        System.out.println("随机数: " + Math.random());

        // 学习Random类
        // 1. 利用带参数的构造器创建对象:
        Random random1 = new Random(System.currentTimeMillis());
        System.out.println(random1.nextInt());

        // 2. 利用空参构造器创建对象:
        Random random2 = new Random(); // 表面实在调用无参构造器, 实际底层还是调用了带参构造器
        System.out.println(random2.nextInt(10)); // 在 0 (包括) 和指定值 (不包括) 之间均匀分布的 int 值
        System.out.println(random2.nextDouble());
    }
}
