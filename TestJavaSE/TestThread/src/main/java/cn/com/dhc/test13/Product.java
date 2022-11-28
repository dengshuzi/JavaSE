package cn.com.dhc.test13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/28 - 下午7:30
 * @Description: cn.com.dhc.test11
 * @version: 1.0
 */
public class Product {
    private String brand;
    private String name;
    private boolean flag = false; // 默认情况下没有商品, 让生产者先生产, 然后消费者再消费
    private Lock lock = new ReentrantLock();
    Condition produceCondition = lock.newCondition();
    Condition consumeCondition = lock.newCondition();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setProduct(String brand, String name) {
        lock.lock();
        try {
            if (flag) {
                try {
                    // wait();
                    // 生产者阻塞, 生产者进入等待队列中
                    produceCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("生产者生产了: " + this.getBrand() + "--->" + this.getName());
            flag = true;
            // notify();
            consumeCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void getProduct() {
        lock.lock();
        try {
            if (!flag) {
                try {
                    // wait();
                    consumeCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者消费了: " + this.getBrand() + "--->" + this.getName());
            flag = false;
            // notify();
            produceCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
