package cn.com.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午7:48
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 第一种情况
        // final修饰一个变量, 变量的值不能改变, 这和变量也变成了一个字符常量, 约定俗成的规定: 名字大写
        final int A = 10; // 基本数据类型
//        A = 20; 报错: 不可以修改值

        // 第二种情况
        final Dog dog = new Dog(); // final修饰引用数据类型, 那么地址值就不可以改变
//        dog = new Dog(); 报错: 地址值不可以更改
        // dog对象的属性依然可以改变
        dog.age = 10;
        dog.weight = 13.7;

        // 第三种情况
        final Dog dog1 = new Dog();
        a(dog1);
        b(dog1);
    }
    public static void a(Dog d) {
        d = new Dog();
    }
    public static void b(final Dog d) { // d被final修饰, 指向不可以改变
//        d = new Dog();
    }
}
