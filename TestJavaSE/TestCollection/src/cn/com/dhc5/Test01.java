package cn.com.dhc5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午1:47
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");

        // 迭代器遍历:
        for (Iterator it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
