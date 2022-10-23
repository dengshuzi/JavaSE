package cn.com.dhc8;

import java.util.Comparator;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午4:00
 * @Description: cn.com.dhc7
 * @version: 1.0
 */
public class Student{
    private int age;
    private double height;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
class Bijiao01 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // 比较年龄
        return o1.getAge() - o2.getAge();
    }
}
class Bijiao02 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // 比较姓名
        return o1.getName().compareTo(o2.getName());
    }
}
class Bijiao03 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // 在年龄相同的情况下比较身高年龄不同比较年龄
        if (o1.getAge() - o2.getAge() == 0) {
            return ((Double) (o1.getHeight())).compareTo((Double) (o2.getHeight()));
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}