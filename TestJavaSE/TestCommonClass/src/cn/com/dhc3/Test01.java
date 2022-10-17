package cn.com.dhc3;
import static java.lang.Math.*;
/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午7:07
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 常用属性:
        System.out.println(PI);
        // 常用方法:
        System.out.println("随机数: " + random()); // [0.0, 1.0)
        System.out.println("绝对值: " + abs(-80)); // 80
        System.out.println("向上取值: " + ceil(9.1)); // 10
        System.out.println("向下取值: " + floor(9.9)); // 9
        System.out.println("四舍五入: " + round(3.3)); // 3
        System.out.println("四舍五入: " + round(3.5)); // 4
        System.out.println("取最大值: " + max(3, 6)); // 6
        System.out.println("取最小值: " + min(3, 6)); // 3
    }
    // 如果Math中方法重复了, 那么会优先调用本类中的方法(就近原则)
    public static int random() {
        return 100;
    }
}
