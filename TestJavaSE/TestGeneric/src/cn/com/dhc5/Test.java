package cn.com.dhc5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/22 - 下午9:32
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        String str = new String();
        obj = str; // 多态的一种形式

        Object[] objArr = new Object[10];
        String[] strArr = new String[10];
        objArr = strArr; // 多态的一种形式

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
//        list1 = list2;

        // 总结: A和B是子类父类的关系, 但是G<A> 和 G<B>不存在继承关系的, 是并列关系
    }
}
