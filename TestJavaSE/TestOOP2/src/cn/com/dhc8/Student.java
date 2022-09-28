package cn.com.dhc8;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/28 - 下午7:46
 * @Description: cn.com.dhc8
 * @version: 1.0
 */
public class Student extends Person {
    double score;
    public Student() {
        /*super();*/
    }
    public Student(double score) {
        this.score = score;
    }
    public Student(int age, String name, double score) {
//        super();
        /*this.age = age;
        this.name = name;*/
        /*super.age = age;
        super.name = name;*/
        super(age, name); // 利用super调用父类构造器
        this.score = score;
    }
}
