package cn.com.dhc1;

import java.util.Scanner;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/15 - 下午6:09
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) throws Exception {
        /*try {
            devide();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        devide();
    }
    public static void devide() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("请录入第二个数:");
        int num2 = sc.nextInt();
        System.out.println("商:" + num1 / num2);
        if (num2 == 0) {
            // 制造运行时异常
            /*throw new RuntimeException();*/

            // 制造检查异常:
            /*try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
            throw new Exception();
        }
    }
}
