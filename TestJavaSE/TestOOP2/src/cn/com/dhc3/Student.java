package cn.com.dhc3;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/27 - 下午9:32
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class Student extends Person{ // 子类Student继承父类Person
    private int sno;
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void study() {
        System.out.println("学习");
    }
}
