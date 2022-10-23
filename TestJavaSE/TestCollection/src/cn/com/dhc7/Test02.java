package cn.com.dhc7;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午4:01
 * @Description: cn.com.dhc7
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student(10, 160.0, "张三");
        Student s2 = new Student(14, 170.0, "李四");
        System.out.println(s1.compareTo(s2));
    }
}
