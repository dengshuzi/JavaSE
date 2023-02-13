package cn.com.dhc.test01;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/8 - 下午9:27
 * @Description: cn.com.dhc.test01
 * @version: 1.0
 */
public class AliPay implements Mtwm{
    @Override
    public void payOnline() {
        // 具体实现支付宝支付的功能:
        System.out.println("我已经点了外卖, 正在使用支付宝支付");
    }
}
