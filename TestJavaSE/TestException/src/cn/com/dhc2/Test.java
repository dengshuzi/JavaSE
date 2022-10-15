package cn.com.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/15 - 下午7:43
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        /*Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        try {
            student.setSex("aa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(student);*/

        Student student2 = new Student("李四", 19, "aaaa");
        System.out.println(student2);
    }
}
