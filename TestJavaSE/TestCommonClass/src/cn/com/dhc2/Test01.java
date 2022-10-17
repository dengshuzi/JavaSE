package cn.com.dhc2;

import java.util.Date;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午12:37
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // java.util.Date:
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toGMTString()); // 过期方法, 过时方法, 废弃方法
        System.out.println(date.toLocaleString());
        System.out.println(date.getYear()); // 122 + 1900
        System.out.println(date.getMonth()); // 9: 返回的值在0和11之间, 值0表示1月
        // 返回自1970年1月1日00:00:00 GMT以来此Date对象表示的毫秒数
        System.out.println(date.getTime()); // 1665895248843
        System.out.println(System.currentTimeMillis());
        /**
         * (1)疑问: 以后获取时间差用: getTime还是currentTimeMillis()
         * 答案: currentTimeMillis() --> 因为这个方法是静态的, 可以类名.方法名直接调用
         * (2)public static native long currentTimeMillis();
         * 本地方法
         * 为什么没有方法体？因为这个方法的具体实现不是通过java写的
         * (3)方法的作用:
         * 一般回去衡量一些算法所用的时间
         */
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long entTime = System.currentTimeMillis();
        System.out.println(entTime - startTime);
    }
}
