package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/8 - 下午9:38
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
//        Cat cat = new Cat();
        Girl girl = new Girl();
//        girl.play(cat);
//        Dog dog = new Dog();
//        girl.play(dog);
//        Cat cat = new Cat();
//        Dog dog = new Dog();
        Pig pig = new Pig();
        Animal animal = pig;

        girl.play(animal);
    }
}
