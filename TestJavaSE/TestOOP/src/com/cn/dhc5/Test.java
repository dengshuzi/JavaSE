package com.cn.dhc5;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 下午5:18
 * @Description: com.cn.dhc5
 * @version: 1.0
 */
public class Test {
    int id;
    static int sid;

    public static void main(String[] args) {
        Test.sid = 100;
        System.out.println(Test.sid);

        Test test1 = new Test();
        test1.id = 10;
        test1.sid = 10;

        Test test2 = new Test();
        test2.id = 20;
        test2.sid = 20;

        Test test3 = new Test();
        test3.id = 30;
        test3.sid = 30;

        System.out.println(test1.id);
        System.out.println(test2.id);
        System.out.println(test3.id);

        System.out.println(test1.sid);
        System.out.println(test2.sid);
        System.out.println(test3.sid);
    }
}
