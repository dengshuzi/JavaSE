package cn.com.dhc.test09;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午9:10
 * @Description: cn.com.dhc.test09
 * @version: 1.0
 */
public class TestThread extends Thread{
    public TestThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}
class Test {
    public static void main(String[] args) {
        TestThread thread = new TestThread("子线程");
        thread.setDaemon(true); // 设置伴随线程: 注意: 先设置, 再启动
        thread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}