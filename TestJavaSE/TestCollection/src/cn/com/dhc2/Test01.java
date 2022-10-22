package cn.com.dhc2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/22 - 下午6:15
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 接口 = 实现类
        Collection collection = new ArrayList();
        List list = new ArrayList();
        // 直接创建实现类对象
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList.add("abd"));
        System.out.println(arrayList.add("def"));

        Vector vector = new Vector();
        vector.add("abc");
    }
}
