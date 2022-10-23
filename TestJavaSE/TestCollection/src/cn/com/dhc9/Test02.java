package cn.com.dhc9;

import java.util.TreeSet;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午4:48
 * @Description: cn.com.dhc9
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("e张三");
        ts.add("b张三");
        ts.add("a张三");
        ts.add("e张三");
        ts.add("c张三");
        ts.add("f张三");
        ts.add("g张三");
        System.out.println(ts.size());
        System.out.println(ts);
    }
}
