package cn.com.dhc.test07;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午8:51
 * @Description: cn.com.dhc.test07
 * @version: 1.0
 */
public class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}
class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            if (i == 6) {
                // 创建子线程:
                TestThread thread = new TestThread("子线程");
                thread.start();
                thread.join();
            }
        }
    }
}
