package com.cn.dhc;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午1:29
 * @Description: com.cn.dhc
 * @version: 1.0
 */
public class Student {
    byte e;
    short s;
    int c; // 成员变量: 在类中方法外
    long num2;
    float f;
    double d;
    char ch;
    boolean bo;
    String name;
    public void study() {
        int num = 10; // 局部变量: 在方法中
        System.out.println(num); // 10
        // int num; 重复命名, 出错了
        {
            int a; // 局部变量: 在代码块中
        }
        if (1==3) {
            int b;
        }
        System.out.println(c);
    }
    public void eat() {
        System.out.println(c);
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.c);
        System.out.println(student.bo);
        System.out.println(student.ch);
        System.out.println(student.d);
        System.out.println(student.e);
        System.out.println(student.f);
        System.out.println(student.name);
        System.out.println(student.num2);
        System.out.println(student.s);
    }
}
