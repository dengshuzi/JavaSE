package cn.com.dhc.test01;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/8 - 下午9:27
 * @Description: cn.com.dhc.test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 定义一个字符串, 用来模拟前台的支付方式:
        String str = "微信";
        if ("微信".equals(str)) {
            // 微信支付:
            pay(new Wechat());
        } else if ("支付宝".equals(str)) {
            // 支付宝支付:
            pay(new AliPay());
        } else if ("信用卡".equals(str)) {
            // 信用卡支付:
            pay(new CreditCard());
        }
    }
    // 方法的形参是接口, 具体传入的是接口的实现类的对象 ---> 多态的一种形式
    public static void pay(Mtwm mtwm) {
        mtwm.payOnline();
    }
}
