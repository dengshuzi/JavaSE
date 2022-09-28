package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/28 - 下午9:07
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三", 18, 180.0);
        System.out.println(student/*.toString()*/); // cn.com.dhc1.Student@74a14482
        System.out.println(student.toString()); // cn.com.dhc1.Student@74a14482
    }
}
