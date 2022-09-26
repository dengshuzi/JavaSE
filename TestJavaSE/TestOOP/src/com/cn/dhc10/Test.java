package com.cn.dhc10;
// 静态导入
import static java.lang.Math.*;
// 导入: java.lang下的Math类中的所有静态内容
/**
 * @Auther: Evin_D
 * @Date: 2022/9/26 - 下午9:23
 * @Description: com.cn.dhc11
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(PI);
        System.out.println(round(5.6));
    }
    // 在静态导入后, 同一个类中所有相同的方法的时候, 会有限走自己定义的方法
    public static int round(double a) {
        return 1000;
    }
}
