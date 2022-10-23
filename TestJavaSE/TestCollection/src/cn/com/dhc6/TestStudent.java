package cn.com.dhc6;

import java.util.HashSet;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午2:46
 * @Description: cn.com.dhc6
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        // 创建一个HashSet集合:
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student(19, "张三"));
        hs.add(new Student(19, "李四"));
        hs.add(new Student(19, "王五"));
        hs.add(new Student(19, "张三"));
        hs.add(new Student(19, "赵六"));
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
