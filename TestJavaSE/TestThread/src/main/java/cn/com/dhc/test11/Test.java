package cn.com.dhc.test11;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/28 - 下午7:37
 * @Description: cn.com.dhc.test11
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        ProducerThread pt = new ProducerThread(product);
        ConsumerThread ct = new ConsumerThread(product);
        pt.start();
        ct.start();
    }
}
