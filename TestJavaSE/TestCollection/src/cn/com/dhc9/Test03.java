package cn.com.dhc9;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午4:54
 * @Description: cn.com.dhc9
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        // 利用外部比较器, 必须自己指定:
        /*Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        TreeSet<Student> ts = new TreeSet<>(com);*/
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }); // 一旦指定外部比较器, 那么就会按照外部比较器来比较
        ts.add(new Student(10, "e张三"));
        ts.add(new Student(8, "b张三"));
        ts.add(new Student(4, "a张三"));
        ts.add(new Student(9, "c张三"));
        ts.add(new Student(10, "e张三"));
        ts.add(new Student(1, "d张三"));
        System.out.println(ts.size());
        System.out.println(ts);
    }
}
