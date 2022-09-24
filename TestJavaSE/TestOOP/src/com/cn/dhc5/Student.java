package com.cn.dhc5;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午5:28
 * @Description: com.cn.dhc5
 * @version: 1.0
 */
public class Student {
    String name;
    int age;
    static String school;

    public static void main(String[] args) {
        Student.school = "辽宁工业大学";
        Student student1 = new Student();
        student1.name = "张三";
        student1.age = 19;
//        student1.school = "辽宁工业大学";

        Student student2 = new Student();
        student2.name = "李四";
        student2.age = 20;
//        student2.school = "辽宁工业大学";
        System.out.println(student2.school);
    }
}
