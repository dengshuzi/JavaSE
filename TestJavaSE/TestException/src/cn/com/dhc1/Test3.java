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
        } catch (Exception e) {
            // 第一种处理: 什么都不写, 什么都不做

            // 第二种处理: 输出自定义异常
            /*System.out.println("对不起, 程序出现异常");*/

            // 第三种处理: 打印异常信息:
            // (1) 调用toString方法, 显示异常的类名(全限定路径)
            /*System.out.println(e);
            System.out.println(e.toString());*/

            // (2) 显示异常描述信息对应的字符串, 如果没有就显示null
            /*System.out.println(e.getMessage());*/

            // (3) 显示异常的堆栈信息: 将异常信息捕获后, 在控制台将异常的效果给我们展示出来, 方便我们查看
            /*e.printStackTrace();*/

            // 第四种处理:  抛出异常:
            throw e;
        }

        System.out.println("感谢使用");
    }
}
