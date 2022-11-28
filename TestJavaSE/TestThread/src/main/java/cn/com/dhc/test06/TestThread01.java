package cn.com.dhc.test06;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午8:43
 * @Description: cn.com.dhc.test06
 * @version: 1.0
 */
public class TestThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
    }
}
class TestThread02 extends Thread {
    @Override
    public void run() {
        for (int i = 20; i <= 30; i++) {
            System.out.println(i);
        }
    }
}
class Test {
    public static void main(String[] args) {
        // 创建两个子线程, 让这两个子线程争抢资源:
        TestThread01 t1 = new TestThread01();
        t1.setPriority(10); // 优先级别高
        t1.start();

        TestThread02 t2 = new TestThread02();
        t1.setPriority(1); // 优先级别低
        t2.start();
    }
}
