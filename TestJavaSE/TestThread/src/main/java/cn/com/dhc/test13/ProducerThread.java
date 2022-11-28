package cn.com.dhc.test13;

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
            if (i % 2 == 0) {
              p.setProduct("费列罗", "巧克力");
            } else {
                p.setProduct("哈尔滨", "啤酒");
            }
        }
    }
}
