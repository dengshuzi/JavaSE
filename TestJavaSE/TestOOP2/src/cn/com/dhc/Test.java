package cn.com.dhc;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/26 - 下午9:35
 * @Description: cn.com.dhc
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Girl girl = new Girl();
        /*girl.age = 18;
        System.out.println(girl.age);*/
        // 设置年龄
        girl.setAge(29);
        // 读取年龄
        System.out.println(girl.getAge());
    }
}
