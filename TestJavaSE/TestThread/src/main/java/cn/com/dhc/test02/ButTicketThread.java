package cn.com.dhc.test02;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午4:52
 * @Description: cn.com.dhc.test02
 * @version: 1.0
 */
public class ButTicketThread extends Thread{
    public ButTicketThread(String name) {
        super(name);
    }
    // 一共10张票
    static int ticketNum = 10;
    // 每个窗口都是一个线程对象: 每个对象执行的代码放入run方法中
    @Override
    public void run() {
        // 每个窗口后面都有100个人在抢票:
        synchronized (ButTicketThread.class) { // 锁必须多个线程用的是同一把锁
            for (int i = 1; i <= 100 ; i++) {
                buyTicket();
            }
        }
    }
    public static synchronized void buyTicket() { // 锁住的同步监视器: BuyTicketThread.class
        if (ticketNum > 0) {
            System.out.println("我在" + Thread.currentThread().getName() + "我买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
        }
    }
}
