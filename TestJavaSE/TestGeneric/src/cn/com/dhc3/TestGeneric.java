package cn.com.dhc3;

import java.util.ArrayList;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/22 - 下午8:42
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class TestGeneric<A, B, C> {
    A age;
    B name;
    C sex;
    /*public static int c(A a) {
        return 10;
    }*/
    public void a(A m, B n, C x) {
//        A[] i = new A[10];
        A[] i = (A[]) new Object[10];
    }
    public TestGeneric() {}
    /*public void b() {
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
        list1 = list2;
    }*/
}
