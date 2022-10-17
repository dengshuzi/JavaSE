package cn.com.dhc5;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/17 - 下午9:16
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 创建StringBuilder对象
        // 表面上调用StringBuilder的空构造器, 实际底层是对value数组进行初始化, 长度为16
        StringBuffer stringBuffer2 = new StringBuffer();
        // 表面上调用StringBuilder的有参构造器, 实际底层是对value数组进行初始化, 长度为你传入的数字
        StringBuffer stringBuffer3 = new StringBuffer(3);
        StringBuffer stringBuffer1 = new StringBuffer("abc");
    }
}
