package cn.com.dhc3;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/7 - 下午5:59
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class Boy {
    int age;
    String name;
    public void buy() {
        System.out.println("买");
    }

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
