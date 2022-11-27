package cn.com.dhc.test04;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午5:19
 * @Description: cn.com.dhc.test04
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BuyTicketThread buyTicketThread = new BuyTicketThread();
        Thread thread1 = new Thread(buyTicketThread, "窗口1");
        thread1.start();
        Thread thread2 = new Thread(buyTicketThread, "窗口2");
        thread2.start();
        Thread thread3 = new Thread(buyTicketThread, "窗口3");
        thread3.start();
    }
}
