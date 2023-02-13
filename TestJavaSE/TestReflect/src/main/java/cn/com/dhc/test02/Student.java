package cn.com.dhc.test02;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/13 - 下午9:24
 * @Description: cn.com.dhc.test02
 * @version: 1.0
 */
public class Student extends Person{
    private int sno;
    double height;
    protected double weight;
    public double score;
    public String showInfo() {
        return "我是一名三好学生";
    }
    private void work() {
        System.out.println("找工作");
    }
    public Student() {
        System.out.println("空参构造器");
    }
    private Student(int sno) {
        this.sno = sno;
    }
    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }
}
