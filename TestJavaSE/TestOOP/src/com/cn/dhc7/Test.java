package com.cn.dhc7;

import com.cn.dhc2.Person; // 导包

/*import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;*/
import java.util.*; // *代表所有

/**
 * @Auther: Evin_D
 * @Date: 2022/9/26 - 下午9:06
 * @Description: com.cn.dhc7
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Person();
        new Date();
        new java.sql.Date(1000L); // 在导包以后, 还想用其他包下同名的类, 就必须要手动自己写所在的包
        new Demo();
        System.out.println(Math.random());
        new ArrayList<>();
        new HashMap<>();
    }
}
