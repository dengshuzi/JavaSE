package cn.com.dhc3;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 上午9:56
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        /*
        LinkedList常用方法:
        增加: addFirst(E e), addLast(E e), offer(E e), offerFirst(E e), offerLast(E e)
        删除: poll(), pollFirst(), pollLast() --> JDK1.6以后新出的方法, 提高了代码的健壮性
             removeFirst(), removeLast()
        修改
        查看: element(), getFirst(), getLast(),
             indexOf(Object o), lastIndexOf(Object o),
             peek(), peekFirst(), peekLast()
        判断
         */
        // 创建一个LinkedList集合对象:
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("eeee");
        list.add("bbbb");
        list.add("ffff");

        list.addFirst("jj");
        list.addLast("hh");

        list.offer("kk"); //添加元素在尾端
        list.offerFirst("pp");
        list.offerLast("rr");

        System.out.println(list.poll()); // 删除头上的元素
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        System.out.println(list); // LinkedList可以添加重复数据

        /*list.clear(); // 清空集合
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list.removeFirst()); // Error: Exception in thread "main" java.util.NoSuchElementException*/

        // 集合遍历:
        System.out.println("=================");
        // 普通for循环:
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=================");
        // 增强for循环:
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("=================");
        // 迭代器:
        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
        // 下面这种方式好, 节省内存
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
