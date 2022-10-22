package cn.com.dhc6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/22 - 下午9:57
 * @Description: cn.com.dhc6
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<?> list = null;
        list = list1;
        list = list2;
        list = list3;
    }
}
