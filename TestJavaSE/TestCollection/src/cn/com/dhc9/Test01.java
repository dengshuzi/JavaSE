package cn.com.dhc9;

import java.util.TreeSet;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午4:32
 * @Description: cn.com.dhc9
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 创建一个TreeSet:
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(3);
        ts.add(7);
        ts.add(9);
        ts.add(3);
        ts.add(16);
        System.out.println(ts.size());
        System.out.println(ts);
    }
}
