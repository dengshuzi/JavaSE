package cn.com.dhc.test01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/9 - 下午8:00
 * @Description: cn.com.dhc.test01
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        // 定义一个字符串, 用来模拟前台的支付方式
        String str = "cn.com.dhc.test01.AliPay"; // 字符串: 实际上就是微信的权限路径

        // 下面的代码就是利用反射:
        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);
    }
}
