package cn.com.dhc2;

import java.sql.Date;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午12:51
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        // java.sql.Date:
        Date date1 = new Date(1665895806420L);
        System.out.println(date1);
        /**
         * (1)java.sql.Date和java.util.Date的区别:
         * java.util.Date: 年月日 时分秒
         * java.sql.Date: 年月日
         * (2)java.sql.Date和java.util.Date的联系:
         * java.sql.Date(子类) extends java.util.Date(父类)
         */

        // java.sql.Date和java.util.Date相互转换:
        // util --> sql:
        java.util.Date date2 = new Date(1665895806420L); // 创建util.Date的对象
        // 方式1: 向下转型
//        Date date3 = (Date) date2;
        Date date3 = (Date) date2;
        /**
         * 父类: Animal 子类: Dog
         * Animal an = new Dog();
         * Dog d = (Dog)an;
         */
        // 方式2: 利用构造器
        Date date4 = new Date(date2.getTime());

        // sql --> util
        java.util.Date date5 = date1;

        // String --> sql.Date:
        Date date6 = Date.valueOf("2022-10-16");
    }
}
