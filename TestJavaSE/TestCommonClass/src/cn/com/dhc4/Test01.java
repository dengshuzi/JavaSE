package cn.com.dhc4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/17 - 下午7:34
 * @Description: cn.com.dhc4
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 声明变量, 类型为String类型:
        String str = "abc";
        System.out.println(str);

        // 通过构造器来创建对象
        String str1 = new String();
        String str2 = new String("abc");
        String str3 = new String(new char[]{'a', 'b', 'c'});
        String str4 = "abc";
        System.out.println("字符串的长度: " + str4.length());

        String str5 = new String("abc");
        System.out.println("字符串是否为空: " + str5.isEmpty());

        System.out.println("获取字符串的下表对应的字符为:" + str5.charAt(1));

        String str6 = new String("abc");
        String str7 = new String("abc");
        System.out.println(str6.equals(str7));

        String str8 = new String("abc");
        String str9 = new String("abcdef");
        System.out.println(str8.compareTo(str9));

        // 字符串的截取
        String str10 = "abcdefhijk";
        System.out.println(str10.substring(3));
        System.out.println(str10.substring(3, 6));

        // 字符串的合并/拼接操作
        System.out.println(str10.concat("pppp"));

        // 字符串中的字符的 替换
        String str11 = "abcdeahija";
        System.out.println(str11.replace('a', 'u'));

        // 按照指定的字符串进行分裂为数组的形式:
        String str12 = "a-b-c-d-e-f";
        String[] strs = str12.split("-");
        System.out.println(Arrays.toString(strs));

        // 转大小写的方法:
        String str13 = "abc";
        System.out.println(str13.toUpperCase());
        System.out.println(str13.toUpperCase().toLowerCase());

        // 去除首尾空格
        String str14 = " a  b  c  ";
        System.out.println(str14.trim());

        // toString()
        String str15 = "abc";
        System.out.println(str15.toString());

        // 转换为String类型
        System.out.println(String.valueOf(false));
    }
}
