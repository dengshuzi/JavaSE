package cn.com.dhc.test08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/27 - 下午9:00
 * @Description: cn.com.dhc.test08
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            // 1. 获取当前时间:
            Date date = new Date();
            // 2. 定义时间格式:
            System.out.println(df.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
