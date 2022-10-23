package cn.com.dhc10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午5:47
 * @Description: cn.com.dhc10
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        增加: put(K key, V value)
        删除: clear(), remove(Object key)
        修改:
        查看: entrySet(), keySet(), size(), values()
        判断: containsKey(Object key), containsValue(Object value)
             equals(), isEmpty()
         */
        // 创建一个Map集合: 无序, 唯一
        Map<String, Integer> map1 = new HashMap();
        System.out.println(map1.put("张三", 10101010));
        map1.put("李四", 10101011);
        map1.put("王五", 10101012);
        System.out.println(map1.put("张三", 10101013));
        map1.put("赵六", 10101014);
        // map.clear(); // 清空
        // map.remove("王五"); // 移除
        System.out.println(map1.size());
        System.out.println(map1);
        System.out.println(map1.containsKey("王五"));
        System.out.println(map1.containsValue(10101013));
        Map<String, Integer> map2 = new HashMap();
        System.out.println(map2.put("张三", 10101010));
        map2.put("李四", 10101011);
        map2.put("王五", 10101012);
        System.out.println(map2.put("张三", 10101013));
        map2.put("赵六", 10101014);
        System.out.println(map1 == map2);
        System.out.println(map1.equals(map2)); // equals进行了重写, 比较的是集合中的值是否一致

        System.out.println("判断是否为空: " + map1.isEmpty());

        System.out.println(map1.get("李四"));

        // keySet()对集合中的key进行遍历查看:
        System.out.println("================");
        Set<String> set1 = map1.keySet();
        for (String s : set1) {
            System.out.println(s);
        }
        // values()对集合中的value进行遍历查看:
        Collection<Integer> values = map1.values();
        for (Integer value : values) {
            System.out.println(value);
        }
        System.out.println("================");
        // get(Object key) keySet()
        Set<String> set2 = map1.keySet();
        for (String s : set2) {
            System.out.println(map1.get(s));
        }
        System.out.println("================");
        // entrySet()
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for (Map.Entry<String, Integer> entry: entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }
}
