package cn.com.dhc.test01;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午2:49
 * @Description: cn.com.dhc.test01
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 给main方法这个主线程设置名字:
        // Thread.currentThread() 作用获取当前正在执行的线程:
        Thread.currentThread().setName("主线程");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "1: " + i);
        }
        // 制造其他线程, 要跟主线程争抢资源:
        // 具体线程对象:  子线程
        TestThread thread = new TestThread("子线程");
        // thread.setName("子线程");
        // thread.run(); // 调用run方法, 想要执行线程中的任务 --> 这个run方法不能直接调用, 直接调用就会被当做一个普通方法
        // 想要thread子线程真正起作用比如要启动线程:
        thread.start(); // start()是Thread类中的方法

        // 主线程中也要输出10个数
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "2: " + i);
        }
    }
}
