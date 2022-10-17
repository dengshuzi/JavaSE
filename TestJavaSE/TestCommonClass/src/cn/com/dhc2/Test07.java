package cn.com.dhc2;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/16 - 下午3:00
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) {
        // 录入日期的String:
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你想要查看的日期(提示: 请按照例如2012-5-6的格式书写): ");
        String strDate = scanner.next();
        // String --> Calender:
        // String --> Date:
        java.sql.Date date = java.sql.Date.valueOf(strDate);
        // Date --> Calender:
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar);

        // 后续操作:
        // 星期提示：
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        // 获取本月的最大天数
        int maxDay = calendar.getActualMaximum(Calendar.DATE);
        // 获取当前日期中的日:
        int nowDay = calendar.get(Calendar.DATE);

        // 将日期调为本月的1号:
        calendar.set(Calendar.DATE, 1);
        // 获取这个一号是本月的第几天
        int num = calendar.get(Calendar.DAY_OF_WEEK);
        // 前面空出来的天数为:
        int day = num - 1;
        // 引入一个计数器:
        int count = 0;
        // 在日期前将空格打印出来:
        for (int i = 1; i <= day; i++) {
            System.out.print("\t");
        }
        // 空出来的日子也要放入计数器:
        count += day;
        // 遍历: 从1号开始到maxDay号进行遍历:
        for (int i = 1; i <= maxDay; i++) {
            if (i == nowDay) {
                System.out.print(i + "*" + "\t");
            } else {
                System.out.print(i + "\t");
            }
            count++;
            if (count % 7 == 0)
                System.out.println();
        }
    }
}
