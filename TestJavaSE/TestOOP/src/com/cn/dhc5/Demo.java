package com.cn.dhc5;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午5:34
 * @Description: com.cn.dhc5
 * @version: 1.0
 */
public class Demo {
    int id;
    static int sid;
    public void a() {
        System.out.println(id);
        System.out.println(sid);
        System.out.println("---------a");
    }
    // 1. static和Public都是修饰符, 并列的没有先后顺序, 先写谁厚些谁都行
    static public void b() {
//         System.out.println(id); // 2. 在静态方法中不能访问非静态的属性
//         a(); // 3. 在静态方法中不能访问非静态的方法
//        System.out.println(this.id); //4. 在静态方法中不能使用this关键字
        System.out.println(sid);
        System.out.println("---------b");
    }

    public static void main(String[] args) {
        // 5. 非静态的方法可以用对象名.方法名去调用
        Demo demo = new Demo();
        demo.a();

        // 6. 静态的方法可以用对象名.方法名去调用也可以用类名.方法名调用(推荐)
        Demo.b();

        // 在同一个类中可以直接调用
        b();
    }
}
