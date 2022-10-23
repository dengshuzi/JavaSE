package cn.com.dhc10;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午9:29
 * @Description: cn.com.dhc10
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("b张三", 1234);
        map.put("a张三", 2345);
        map.put("b张三", 5467);
        map.put("c张三", 5678);
        map.put("d张三", 2345);
        System.out.println(map.size());
        System.out.println(map);
    }
}
