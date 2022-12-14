package cn.com.dhc1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/21 - 下午9:55
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        /**
         * List接口中常用方法:
         * 增加: add(int index, E element)
         * 删除: remove(int index), remove(Object o)
         * 修改: set(int index, E element)
         * 查看: get(int index)
         * 判断:
         */
        List list = new ArrayList<>();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        list.add("abc");
        System.out.println(list);
        list.add(3, 66);
        System.out.println(list);
        list.set(3, 77);
        System.out.println(list);
        list.remove(2);
        System.out.println(list); // 在集合中存入的是Integer类型数据的时候, 调用remove方法调用的是: remove(int index)
        list.remove("abc");
        System.out.println(list);
        Object o = list.get(0);
        System.out.println(o);

        // List集合遍历:
        // 方式1: 普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("======================");
        // 方式2: 增强for循环
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("======================");
        // 方式3: 迭代器
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
