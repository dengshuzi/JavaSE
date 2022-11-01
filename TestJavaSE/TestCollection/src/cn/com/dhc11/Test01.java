package cn.com.dhc11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/1 - 下午7:52
 * @Description: cn.com.dhc11
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // Collections不支持创建对象, 因为构造器私有化了
        // Collections cols = new Collections();
        // 里面的属性和方法都是被static修饰, 我们可以直接用类名.调用即可
        // 常用方法:
        // addAll:
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("cc");
        list1.add("bb");
        list1.add("aa");
        Collections.addAll(list1, "ee", "dd", "ff");
        Collections.addAll(list1, new String[]{"gg", "hh", "jj"});
        System.out.println(list1);

        //binarySearch必须在有序集合中查找: --> 排序:
        Collections.sort(list1); // sort提供的是升序排列
        System.out.println(list1);
        System.out.println(Collections.binarySearch(list1, "cc"));

        // copy: 替换方法
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "tt", "ss");
        Collections.copy(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

        // fill: 填充
        Collections.fill(list2, "yyy");
        System.out.println(list2);
    }
}
