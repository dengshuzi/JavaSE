package cn.com.dhc1;

import java.util.Scanner;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/14 - 下午9:59
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 实现一个功能: 键盘录入两个数, 求商:
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个数:");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            System.out.println("请录入第二个数:");
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                if (num2 == 0) {
                    System.out.println("对不起除数不能为0");
                } else {
                    System.out.println("商:" + num1 / num2);
                }
            } else {
                System.out.println("对不起, 你录入的不是int类型的数据");
            }
        } else {
            System.out.println("对不起, 你录入的不是int类型的数据");
        }
    }
}
