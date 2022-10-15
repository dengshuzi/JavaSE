package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/15 - 下午9:35
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        // 自动装箱
        // int --> Integer
        Integer integer1 = 12;
        System.out.println(integer1);

        // 自动拆箱
        Integer integer2 = new Integer(12);
        int num = integer2;
        System.out.println(num);
    }
}
