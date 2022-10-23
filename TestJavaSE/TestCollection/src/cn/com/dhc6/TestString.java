package cn.com.dhc6;

import java.util.HashSet;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午2:42
 * @Description: cn.com.dhc6
 * @version: 1.0
 */
public class TestString {
    public static void main(String[] args) {
        // 创建一个HashSet集合:
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("apple");
        hs.add("banana");
        hs.add("html");
        hs.add("apple");
        hs.add("css");
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
