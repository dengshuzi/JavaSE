package cn.com.dhc.test11;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/28 - 下午7:31
 * @Description: cn.com.dhc.test11
 * @version: 1.0
 */
public class ProducerThread extends Thread{
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (p) {
                if (i % 2 == 0) {
                    p.setBrand("费列罗");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("巧克力");
                } else {
                    p.setBrand("哈尔滨");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("啤酒");
                }
                System.out.println("生产者生产了: " + p.getBrand() + "--->" + p.getName());
            }
        }
    }
}
