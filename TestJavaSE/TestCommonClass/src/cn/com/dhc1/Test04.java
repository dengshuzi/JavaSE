package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/15 - 下午9:39
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        // compareTo: 只返回三个值: 0, 1, -1
        Integer integer1 = new Integer(55);
        Integer integer2 = new Integer(12);
        System.out.println(integer1.compareTo(integer2)); // return (x < y) ? -1 : ((x == y) ? 0 : 1);

        // equals: Integer对Object中的equals方法进行了重写, 比较的是底层封装的value的值
        // Integer对象是通过new关键字创建的对象:
        Integer integer3 = new Integer(1);
        Integer integer4 = new Integer(12);
        System.out.println(integer3 == integer4); // false 因为==比较的是两个对象的地址
        System.out.println(integer3.equals(integer4));

        // Integer对象通过自动装箱来完成:
        Integer integer5 = 130;
        Integer integer6 = 130;
        System.out.println(integer5.equals(integer6)); // true
        System.out.println(integer5 == integer6);
        /**
         * 如果自动装箱值在-128~127之间, 那么比较的就是具体的数值
         * 否则比较的就是对象的地址
         */

        // intValue(): 作用将Integer --> int
        Integer integer7 = 130;
        int i = integer7.intValue();
        System.out.println(i);

        // parseInt(String s): String --> int
        System.out.println(Integer.parseInt("12"));

        // toString(): Integer --> String
        Integer integer8 = 130;
        System.out.println(integer8.toString());
    }
}
