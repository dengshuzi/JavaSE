package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/8 - 下午10:03
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal = new Pig();
        animal.shout();
        // 假如转型的代码
        // 将Animal转为Pig
        Pig pig = (Pig) animal;
        pig.eat();
        pig.age = 10;
        pig.weight = 60.8;
    }
}
