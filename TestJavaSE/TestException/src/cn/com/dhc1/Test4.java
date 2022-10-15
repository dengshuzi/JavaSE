package cn.com.dhc1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/14 - 下午10:22
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        // 实现一个功能: 键盘录入两个数, 求商:
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第一个数:");
            int num1 = sc.nextInt();
            System.out.println("请录入第二个数:");
            int num2 = sc.nextInt();
            System.out.println("商:" + num1 / num2);
        } catch (InputMismatchException e) {
            System.out.println("对不起, 你录入的数据不是int类型的数据");
        }  catch (ArithmeticException e) {
            System.out.println("对不起, 除数不可以为0");
        }   catch (Exception e) {
            System.out.println("对不起, 你的程序出现异常");
        } finally {
            System.out.println("感谢使用");
        }
    }
}