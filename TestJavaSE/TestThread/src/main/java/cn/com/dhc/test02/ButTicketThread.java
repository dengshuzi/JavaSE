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
        for (int i = 1; i <= 100 ; i++) {
            if (ticketNum > 0) {
                System.out.println("我在" + this.getName() + "我买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
            }
        }
    }
}
