package cn.com.dhc.test03;

import java.io.Serializable;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/15 - 下午7:26
 * @Description: cn.com.dhc.test03
 * @version: 1.0
 */
public class Person implements Serializable {
    private int age;
    private String name;
    private void eat() {
        System.out.println("Person eat");
    }
    private void sleep() {
        System.out.println("Person sleep");
    }
}
