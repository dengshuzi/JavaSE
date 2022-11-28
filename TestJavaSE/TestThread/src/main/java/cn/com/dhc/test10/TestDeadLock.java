package cn.com.dhc.test10;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/28 - 下午7:19
 * @Description: cn.com.dhc.test10
 * @version: 1.0
 */
public class TestDeadLock implements Runnable{
    public int flag = 1;
    static Object o1 = new Object();
    static Object o2 = new Object();

    @Override
    public void run() {
        System.out.println("flat: " + flag);
        // 当flag == 1锁住o1
        if (flag == 1) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 只要锁住o2就完成
                synchronized (o2) {
                    System.out.println("2");
                }
            }
        }
        // 如果flag == 0 就锁住o2
        if (flag == 0) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 只要锁住o1就完成
                synchronized (o1) {
                    System.out.println("3");
                }
            }
        }
    }

    public static void main(String[] args) {
        TestDeadLock td1 = new TestDeadLock();
        TestDeadLock td2 = new TestDeadLock();
        td1.flag = 1;
        td2.flag = 0;
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
    }
}
