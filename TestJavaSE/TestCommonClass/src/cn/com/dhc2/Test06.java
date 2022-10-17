package cn.com.dhc2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午1:40
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        // Calendar是一个抽象类, 不可以直接创建对象
        // GregorianCalendar(子类) extends Calendar（父类是一个抽象类）
        Calendar calendar1 = new GregorianCalendar();
        Calendar calendar2 = Calendar.getInstance();
        System.out.println(calendar1);

        // 常用方法:
        // get方法: 传入参数: Calendar中定义的常量
        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONTH));
        System.out.println(calendar1.get(Calendar.DATE));
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar1.getMaximum(Calendar.DATE)); // 获取当月日期的最大天数
        System.out.println(calendar1.getMinimum(Calendar.DATE)); // 获取当月日期的最小天数

        // set方法: 可以改变Calendar中的内容
        calendar1.set(Calendar.YEAR, 1996);
        calendar1.set(Calendar.MONTH, 2);
        calendar1.set(Calendar.DATE, 17);
        System.out.println(calendar1);

        // String --> Calendar:
        // 分解:
        // String --> Date:
        java.sql.Date date = java.sql.Date.valueOf("2020-10-16");
        // java.sql.Date --> Calendar:
        calendar1.setTime(date);
        System.out.println(calendar1);
    }
}
