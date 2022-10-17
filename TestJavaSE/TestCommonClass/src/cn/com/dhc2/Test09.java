package cn.com.dhc2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午5:11
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test09 {
    public static void main(String[] args) {
        // 格式化类: DateTimeFormatter

        // 方式一: 预定义的标准格式: 如: ISO_LOCAL_DATE_TIME; ISO_LOCAL_DATE; ISO_LOCAL_TIME;
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // isoLocalDateTime1就可以帮我们完成LocalDateTIme和String之间的相互转换:
        // LocalDateTime --> String:
        LocalDateTime localDateTime1 = LocalDateTime.now();
        String str1 = dateTimeFormatter1.format(localDateTime1);
        System.out.println(str1);

        // String --> LocalDateTime
        TemporalAccessor temporalAccessor1 = dateTimeFormatter1.parse("2022-10-16T17:23:24.556");
        System.out.println(temporalAccessor1);

        // 方式二: 本地化相关的格式: 如: ofLocalizedDateTime()
        // 参数: FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT
        // FormatStyle.LONG: October 16, 2022 5:35:47 PM CT
        // FormatStyle.MEDIUM: Oct 16, 2022 5:34:28 PM
        // FormatStyle.SHORT: 10/16/22 5:33 PM
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withZone(ZoneId.systemDefault());
        // LocalDateTime --> String:
        LocalDateTime localDateTime2 = LocalDateTime.now();
        String str2 = dateTimeFormatter2.format(localDateTime2);
        System.out.println(str2);

        // String --> LocalDateTime
        TemporalAccessor temporalAccessor2 = dateTimeFormatter2.parse("October 16, 2022 5:35:47 PM CT");
        System.out.println(temporalAccessor2);

        // 方式三: 自定义的格式: 如: ofPattern("yyyy-MM-dd hh:mm:ss") --> 重点, 以后常用
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime localDateTime3 = LocalDateTime.now();
        String str3 = dateTimeFormatter3.format(localDateTime3);
        System.out.println(str3);
        // String --> LocalDateTime
        TemporalAccessor temporalAccessor3 = dateTimeFormatter3.parse("2022-10-16 05:40:09");
        System.out.println(temporalAccessor3);
    }
}
