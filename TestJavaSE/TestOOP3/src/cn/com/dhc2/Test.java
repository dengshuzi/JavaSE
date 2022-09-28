package cn.com.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/28 - 下午9:29
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Mi10", 6999.0, 2022);
        Phone phone2 = new Phone("Mi10", 6999.0, 2022);
        // 比较两个对象: p1和p2对象:
        // ==的作用, 比较左右两侧的值是否相等, 要么相等, 返回true, 要么不相等, 返回false
        System.out.println(phone1 == phone2); // --> 对于引用数据类型来说, 比较的是地址值 ---> 一定返回的是false

        // Object类提供了一个方法equals方法: 作用: 比较对象具体内容是否相等
        System.out.println(phone1.equals(phone2));

        Cat cat = new Cat();
        System.out.println(phone1.equals(cat));
    }
}
