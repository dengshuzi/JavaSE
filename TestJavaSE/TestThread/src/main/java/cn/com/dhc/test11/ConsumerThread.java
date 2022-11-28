package cn.com.dhc.test11;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/28 - 下午7:35
 * @Description: cn.com.dhc.test11
 * @version: 1.0
 */
public class ConsumerThread extends Thread{
    private Product p;

    public ConsumerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (p) {
                System.out.println("消费者消费了: " + p.getBrand() + "--->" + p.getName());
            }
        }
    }
}
