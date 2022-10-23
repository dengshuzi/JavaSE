package cn.com.dhc6;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午2:40
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public class TestInteger {
    public static void main(String[] args) {
        // 创建一个HashSet集合:
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        System.out.println(hs.add(19)); // true
        hs.add(5);
        hs.add(20);
        System.out.println(hs.add(19)); // false 这个19没有放入到集合中
        hs.add(41);
        hs.add(0);
        System.out.println(hs.size()); // 唯一, 无序
        System.out.println(hs);
    }
}
