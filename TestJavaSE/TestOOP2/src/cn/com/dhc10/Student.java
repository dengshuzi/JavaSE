package cn.com.dhc10;

import cn.com.dhc8.Person;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/28 - 下午8:35
 * @Description: cn.com.dhc10
 * @version: 1.0
 */
public class Student extends Person {
    double height;

    public Student(int age, String name, double height) {
        super(age, name);
        this.height = height;
    }

    public Student() {
    }
}
