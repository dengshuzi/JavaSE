package cn.com.dhc.test03;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午5:08
 * @Description: cn.com.dhc.test03
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        TestThread tt = new TestThread();
        Thread t = new Thread(tt, "子线程");
        t.start();

        // 主线程里面也是打印1-10数字:
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
