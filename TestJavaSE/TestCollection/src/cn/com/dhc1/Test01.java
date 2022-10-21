package cn.com.dhc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/21 - 下午9:27
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * Collection接口的常用方法:
         * 增加: add(E e), addAll(Collection<? extends E> c)
         * 删除: clear(), remove()
         * 修改:
         * 查看: iterator(), size()
         * 判断: contains(Object o), equals(Object o), isEmpty()
         */
        // 创建对象: 接口不能创建对象, 利用实现类创建对象:
        Collection col1 = new ArrayList();
        // 调用方法:
        // 集合有一个特点: 只能存放引用数据类型的数据, 不能是基本数据类型
        // 基本数据类型自动装箱, 对应包装类 int --> Integer
        col1.add(18);
        col1.add(12);
        col1.add(11);
        col1.add(17);
        System.out.println(col1);

        List list = Arrays.asList(new Integer[]{11, 15, 3, 7, 1});
        col1.addAll(list); // 将另一个集合添加入col中
        System.out.println(col1);

        // 清空集合
//        col.clear();
        System.out.println(col1);
        System.out.println("集合中元素的数量为: " + col1.size());
        System.out.println("集合是否为空： " + col1.isEmpty());

        boolean isRemove = col1.remove(15);
        System.out.println(col1);
        System.out.println("集合中元素是否被删除: " + isRemove);

        Collection col2 = new ArrayList();
        col2.add(18);
        col2.add(12);
        col2.add(11);
        col2.add(17);

        Collection col3 = new ArrayList();
        col3.add(18);
        col3.add(12);
        col3.add(11);
        col3.add(17);

        System.out.println(col2.equals(col3));
        System.out.println(col2 == col3); // 地址一定不相等 false

        System.out.println("是否包含元素: " + col3.contains(17));
        System.out.println("是否包含元素: " + col3.contains(117));
    }
}
