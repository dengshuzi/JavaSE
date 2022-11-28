package cn.com.dhc.test09;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午9:16
 * @Description: cn.com.dhc.test09
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 6)
                Thread.currentThread().stop(); // 过期方法, 不建议使用
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
