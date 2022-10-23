package cn.com.dhc9;

import java.util.Comparator;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午4:50
 * @Description: cn.com.dhc9
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
