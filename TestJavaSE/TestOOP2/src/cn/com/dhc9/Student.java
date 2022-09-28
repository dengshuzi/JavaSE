package cn.com.dhc9;

import cn.com.dhc8.Person;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/28 - 下午8:27
 * @Description: cn.com.dhc9
 * @version: 1.0
 */
public class Student extends Person {
    double height;
    double weight;

    public Student(int age, String name, double height, double weight) {
        super(age, name);
        this.height = height;
        this.weight = weight;
    }

    public Student() {
    }
}
