package cn.com.dhc1;

import java.util.HashMap;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/24 - 下午9:19
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 创建一个HashMap对象: 存储的是双列数据, 键值对 key-value
        HashMap<Integer, String> hashMap = new HashMap<>();
        // 存储数据:
        System.out.println(hashMap.put(12, "张三"));
        System.out.println(hashMap.put(7, "李四"));
        System.out.println(hashMap.put(19, "王五"));
        System.out.println(hashMap.put(12, "赵六"));
        System.out.println(hashMap.put(6, "李七"));
        System.out.println("集合中的元素: " + hashMap);
        System.out.println("集合中元素的数量: " + hashMap.size());
    }
}
