package cn.com.dhc.test04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午5:16
 * @Description: cn.com.dhc.test04
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable {
    int ticketNum = 10;
    // 拿来一把锁:
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        // 此处有1000行代码
        for (int i = 1; i <= 100 ; i++) {
            // 拿来一把锁:
            lock.lock();
            try {
                if (ticketNum > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() + "我买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 关闭锁:
                lock.unlock();
            }
        }
        // 此处有1000行代码
    }
}
