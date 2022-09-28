package cn.com.dhc7;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/28 - 下午7:27
 * @Description: cn.com.dhc7
 * @version: 1.0
 */
public class Student extends Person {
    double score;
    int age = 20;
    public void study() {
        System.out.println("学习");
    }
    public void eat() {
        System.out.println("吃饭2");
    }
    public void a() {
        System.out.println(/*super.*/age); // 10
        System.out.println(this.age); // 20
        /*super.*/eat(); // 吃饭
    }
}
