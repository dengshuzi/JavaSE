package cn.com.dhc.test03;

import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/13 - 下午9:24
 * @Description: cn.com.dhc.test02
 * @version: 1.0
 */
@MyAnnotation(value = "hello")
public class Student extends Person implements MyInterface {
    private int sno;
    double height;
    protected double weight;
    public double score;
    @MyAnnotation(value = "hiMethod")
    public String showInfo() {
        return "我是一名三好学生";
    }
    public String showInfo(int a, int b) {
        return  "重载";
    }
    private void work(int a) {
        System.out.println("找工作");
    }
    void happy() {
        System.out.println("开心");
    }
    protected int getSon() {
        return sno;
    }
    public Student() {
        System.out.println("空参构造器");
    }
    public Student (double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    private Student(int sno) {
        this.sno = sno;
    }
    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }
    protected Student(int sno, double height, double weight) {
        this.sno = sno;
    }
    @Override
    @MyAnnotation("helloMyMethod")
    public void myMethod() throws RuntimeException {
        System.out.println("重写");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}
