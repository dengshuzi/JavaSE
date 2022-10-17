package cn.com.dhc2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午3:43
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test08 {
    public static void main(String[] args) {
        // 1. 完成实例化
        // 方法1： now() -- 获取当前的日期, 时间, 日期 + 时间
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        // 方法2: of() --制定日期, 时间, 日期 + 时间
        LocalDate localDate2 = LocalDate.of(2021, 10, 16);
        System.out.println(localDate2);
        LocalTime localTime2 = LocalTime.of(12, 35, 56);
        System.out.println(localTime2);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 10, 16, 16, 17, 19);
        System.out.println(localDateTime2);

        // LocalDate, LocalTime用的不如LocalDateTime多
        // 下面讲解用LocalDateTime:
        // 一系列常用的get***
        System.out.println(localDateTime2.getYear());
        System.out.println(localDateTime2.getMonth());
        System.out.println(localDateTime2.getMonthValue());
        System.out.println(localDateTime2.getDayOfMonth());
        System.out.println(localDateTime2.getDayOfWeek());
        System.out.println(localDateTime2.getHour());
        System.out.println(localDateTime2.getMinute());
        System.out.println(localDateTime2.getSecond());

        // 不是set方法, 叫with
        // 体会: 不可变性
        LocalDateTime localDateTime3 = localDateTime2.withMonth(8);
        System.out.println(localDateTime1);
        System.out.println(localDateTime3);

        // 提供了加减的操作:
        // 加:
        LocalDateTime localDateTime5 = localDateTime1.plusMonths(4);
        System.out.println(localDateTime1);
        System.out.println(localDateTime5);
        // 减:
        LocalDateTime localDateTime6 = localDateTime1.minusMonths(5);
        System.out.println(localDateTime1);
        System.out.println(localDateTime6);
    }
}
