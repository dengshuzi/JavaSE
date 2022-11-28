package cn.com.dhc.test05;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午8:17
 * @Description: cn.com.dhc.test05
 * @version: 1.0
 */
public class TestRandom implements Callable<Integer> {
    /**
     * @return Integer
     * @throws Exception
     * 1. 实现Callable接口, 可以不带泛型, 如果不带泛型, 那么call方式的返回值就是Object类型
     * 2. 如果带泛型, 那么call的返回值就是泛型对应的类型
     * 3. 从call方法看到: 方法有返回值, 可以抛出异常
     */
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10); // 返回10以内的随机数
    }
}
class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 定义一个线程对象:
        TestRandom testRandom = new TestRandom();
        FutureTask futureTask = new FutureTask(testRandom);
        Thread thread = new Thread(futureTask);
        thread.start();
        // 获取线程得到的返回值:
        Object obj = futureTask.get();
        System.out.println(obj);
    }
}