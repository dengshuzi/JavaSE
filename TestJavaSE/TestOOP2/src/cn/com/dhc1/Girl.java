package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/26 - 下午9:35
 * @Description: cn.com.dhc
 * @version: 1.0
 */
public class Girl {
    // 属性:
    private int age;
    private int sno;
    private String name;
    private double height;
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // 读取年龄
    public int getAge() {
        return age;
    }

    // 设置年龄
    public void setAge(int age) {
        if (age >= 30) {
            this.age = 18;
        }
        this.age = age;
    }
}
