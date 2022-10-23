package cn.com.dhc8;

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
        // 获取比较器:
        Bijiao01 bj1 = new Bijiao01();
        Bijiao02 bj2 = new Bijiao02();
        Bijiao03 bj3 = new Bijiao03();
        System.out.println(bj1.compare(s1, s2));
        System.out.println(bj2.compare(s1, s2));
        System.out.println(bj3.compare(s1, s2));
    }
}
