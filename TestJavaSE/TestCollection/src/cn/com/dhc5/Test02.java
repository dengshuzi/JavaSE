package cn.com.dhc5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午2:08
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        // 在"cc"之后添加一个字符串"kk"
        ListIterator it = list.listIterator();
        while (it.hasNext()) {
            if ("cc".equals(it.next())) {
                it.add("kk");
            }
        }
        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());
        // 逆向遍历:
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());
        System.out.println(list);
    }
}
