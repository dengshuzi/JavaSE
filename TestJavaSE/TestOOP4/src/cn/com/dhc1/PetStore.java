package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午7:30
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class PetStore {
    // 提供动物
    public static Animal getAnimal(String petName) {
        Animal animal = null;
        if (("猫".equals((petName)))) { // petName.equals("猫") --> 这样写容易发生空指针异常
            animal = new Cat();
        } else if(("狗".equals((petName)))) {
            animal = new Dog();
        } else if(("猪".equals((petName)))) {
            animal = new Pig();
        }
        return animal;
    }
}
