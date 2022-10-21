package cn.com.dhc1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/21 - 下午9:41
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Collection col1 = new ArrayList();
        col1.add(18);
        col1.add(12);
        col1.add(11);
        col1.add(17);

        // 对集合遍历 (对集合中元素进行查看)
        // 方式1: 普通for循环
        /*for (int i = 0; i < col1.size(); i++) {
            col1.
        }*/

        // 方式2: 增强for循环
        for (Object o: col1) {
            System.out.println(o);
        }
        System.out.println("==================");
        // 方式3:
        Iterator it = col1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
