package cn.com.dhc1;

import java.util.ArrayList;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/22 - 下午8:03
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 创建一个ArrayList集合, 想这个集合中存入学生的成绩:
        // 加入泛型的优点: 在编译时期就会对类型进行检查, 不是泛型对应的类型就不可以加入这个集合
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(98);
        arrayList.add(18);
        arrayList.add(39);
        arrayList.add(60);
        arrayList.add(83);
        /*arrayList.add("张三");
        arrayList.add(9.8);*/

        // 对集合遍历查看:
        /*for (Object al: arrayList) {
            System.out.println(al);
        }*/
        for (Integer i: arrayList) {
            System.out.println(i);
        }
    }
}
