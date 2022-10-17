package cn.com.dhc2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午1:20
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        // 日期转换
        // SimpleDateFormat(子类) extends DateFormat(父类是一个抽象类)
        // 格式化的标准已经定义好了
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String --> Date
        try {
            System.out.println(dateFormat.parse("2020-10-16 13:26:22"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // Date --> String
        System.out.println(dateFormat.format(new Date()));

        Date date2 = new Date();
        System.out.println(date2.toString());
        System.out.println(date2.toGMTString());
        System.out.println(date2.toLocaleString());
    }
}
