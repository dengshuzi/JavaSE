package cn.com.dhc10;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午9:32
 * @Description: cn.com.dhc10
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Map<Student,Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return ((Double)(o1.getHeight())).compareTo((Double) (o2.getHeight()));
            }
        });
        map.put(new Student(19, 170.5, "b张三"), 1001);
        map.put(new Student(18, 150.5, "b张三"), 1002);
        map.put(new Student(19, 180.5, "a张三"), 1003);
        map.put(new Student(17, 140.5, "c张三"), 1004);
        map.put(new Student(10, 160.5, "d张三"), 1005);
        System.out.println(map);
        System.out.println(map.size());
    }
}
