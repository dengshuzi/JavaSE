package cn.com.dhc4;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/17 - 下午8:56
 * @Description: cn.com.dhc4
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        String str1 = "a" + "b" + "c";
        String str2 = "ab" + "c";
        String str3 = "a" + "bc";
        String str4 = "abc";
        String str5 = "abc" + "";
        System.out.println(str1 == str4);
        System.out.println(str2 == str5);

        String str6 = new String("abc");
    }
}
