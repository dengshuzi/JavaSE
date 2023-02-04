package cn.com.dhc.anno.cn.com.dhc.anno2;

import java.util.ArrayList;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/4 - 下午9:13
 * @Description: cn.com.dhc.anno.cn.com.dhc.anno2
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        @SuppressWarnings("unsued")
        int age = 10;

        int num = 10;
        System.out.println(num);
        @SuppressWarnings({"unused", "rwatypes"})
        ArrayList al = new ArrayList();
    }
}
