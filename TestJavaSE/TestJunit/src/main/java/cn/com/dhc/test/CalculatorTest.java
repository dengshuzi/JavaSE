package cn.com.dhc.test;

import cn.com.dhc.calculator.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/3 - 下午10:53
 * @Description: cn.com.dhc.test
 * @version: 1.0
 */
public class CalculatorTest {
    @Before
    public void init() {
        System.out.println("方法测试开始了");
    }
    @After
    public void close() {
        System.out.println("方法测试结束");
    }

    // 测试add方法
    @Test
    public void testAdd() {
        System.out.println("测试add方法");
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 30);
        // System.out.println(result); --> 程序的结果可以不关注
        // 假如加入断言: 预测一下结果, 判断一下我预测的结果和实际的结果是否一致:
        Assert.assertEquals(40, result); //第一个参数: 预测结果 第二个结果: 实际结果
    }

    // 测试sub方法
    @Test
    public void testSub() {
        System.out.println("测试sub方法");
        Calculator calculator = new Calculator();
        int result = calculator.sub(10, 30);
        System.out.println(result);
    }
}
