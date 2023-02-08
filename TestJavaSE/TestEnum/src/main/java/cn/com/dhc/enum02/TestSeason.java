package cn.com.dhc.enum02;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/8 - 下午7:47
 * @Description: cn.com.dhc.enum02
 * @version: 1.0
 */
public class TestSeason {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter);
        // enum关键字对应的枚举类的上层父类: java.lang.Enum
        // 但是我们自定义的枚举类的上层父类: Object
        System.out.println(Season.class.getSuperclass().getName()); // java.lang.Enum
    }
}
