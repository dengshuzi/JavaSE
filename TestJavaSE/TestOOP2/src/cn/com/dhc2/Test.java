package cn.com.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/26 - 下午9:47
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        student.setSex("男");
        System.out.println(student.getName() + "-----" + student.getAge() + "-----" + student.getSex());

        Student student1 = new Student("李四", 21, "女");
        System.out.println(student1.getName() + "-----" + student1.getAge() + "-----" + student1.getSex());

    }
}
