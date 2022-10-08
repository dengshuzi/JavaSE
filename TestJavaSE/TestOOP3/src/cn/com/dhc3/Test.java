package cn.com.dhc3;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/8 - 下午9:12
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy(30, "张三");
        Girl girl = new Girl( "李四", 100.0);
//        girl.love(boy);
        Boy boy2 = new Boy(35, "王五");
        girl.love(boy2);
        girl.mom = new Mom();
        girl.wechat();
    }
}
