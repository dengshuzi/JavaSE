package cn.com.dhc1;

import java.util.Scanner;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/14 - 下午10:22
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        // 实现一个功能: 键盘录入两个数, 求商:
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第一个数:");
            int num1 = sc.nextInt();
            System.out.println("请录入第二个数:");
            int num2 = sc.nextInt();
            System.out.println("商:" + num1 / num2);
            System.exit(0); // 终止当前的虚拟机执行
            return;
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("感谢使用");
        }
    }
}
