package cn.com.dhc.test02;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午4:55
 * @Description: cn.com.dhc.test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 多个窗口抢票: 三个窗口三个线程对象:
        ButTicketThread t1 = new ButTicketThread("窗口1");
        t1.start();
        ButTicketThread t2 = new ButTicketThread("窗口2");
        t2.start();
        ButTicketThread t3 = new ButTicketThread("窗口3");
        t3.start();
    }
}
