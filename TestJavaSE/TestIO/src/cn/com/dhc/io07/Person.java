package cn.com.dhc.io07;

import java.io.Serializable;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/26 - 上午11:28
 * @Description: cn.com.dhc.io07
 * @version: 1.0
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 3145275843849292329L;
    private String name;
    private int age;
    private Family f = new Family();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
