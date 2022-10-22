package cn.com.dhc6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/22 - 下午9:54
 * @Description: cn.com.dhc6
 * @version: 1.0
 */
public class Test {
    public void a(List<?> list) {
        // 1. 遍历:
        for (Object obj : list) {
            System.out.println(obj);
        }
        // 2.数据的写入操作:
        // list.add("abc"); --> 出错, 不能随意的添加数据
        list.add(null);

        // 3. 数据的读取操作:
        Object s = list.get(0);
    }
}
class T {
    public static void main(String[] args) {
        Test test = new Test();
        test.a(new ArrayList<Integer>());
        test.a(new ArrayList<String>());
        test.a(new ArrayList<Object>());
    }
}