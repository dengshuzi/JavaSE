package cn.com.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午1:17
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
         // (1)String--->java.sql.Date
        java.sql.Date date = java.sql.Date.valueOf("2020/10/16");
         // (2)java.sql.Date--->java.util.Date
        java.util.Date date1 = date;
        System.out.println(date1);
    }
}
