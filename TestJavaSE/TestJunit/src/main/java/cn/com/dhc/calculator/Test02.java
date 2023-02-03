package cn.com.dhc.calculator;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/3 - 下午10:45
 * @Description: cn.com.dhc.calculator
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        // 测试减法:
        Calculator calculator = new Calculator();
        int result = calculator.sub(30, 10);
        System.out.println(result);
    }
}
