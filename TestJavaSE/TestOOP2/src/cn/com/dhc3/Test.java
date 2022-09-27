package cn.com.dhc3;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/27 - 下午9:40
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSno(1001);
        student.setName("张三");
        student.setAge(18);
        student.setHeight(180.0);
        System.out.println("姓名" + student.getName() + "学号" + student.getSno());
        student.eat();
        student.study();
    }
}
