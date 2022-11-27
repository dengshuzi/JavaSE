package cn.com.dhc.test03;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午5:08
 * @Description: cn.com.dhc.test03
 * TestThread实现了这个接口, 才会编程一个线程类
 * @version: 1.0
 */
public class TestThread implements Runnable{
    @Override
    public void run() {
        // 输出1-10数字:
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
