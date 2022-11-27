package cn.com.dhc.test04;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午5:16
 * @Description: cn.com.dhc.test04
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable {
    int ticketNum = 10;
    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            if (ticketNum > 0) {
                System.out.println("我在" + Thread.currentThread().getName() + "我买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
            }
        }
    }
}
