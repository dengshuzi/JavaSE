package cn.com.dhc.anno;

/**
 * @Auther Evin_D
 * @Date 2023/2/4 - 下午8:39
 * @Description cn.com.dhc.anno
 * @version 1.0
 */
public class Person {
    /**
     * 下面是eat方法，实现了XXX功能
     * @param num1 就餐人数
     * @param num2 点了几个菜
     */
    public void eat(int num1, int num2) {

    }

    /**
     *
     * @param age 年龄
     * @return int
     * @exception RuntimeException 当年龄过大的时候
     * @exception RuntimeException 当年龄过小的时候
     * @see Student
     */
    public int sleep (int age) {
        new Student();
        if(age > 100) {
            throw new RuntimeException();
        }
        if (age < 0) {
            throw new RuntimeException();
        }
        return 10;
    }
}
