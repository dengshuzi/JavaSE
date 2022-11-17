package cn.com.dhc.io04;

import java.io.*;
import java.util.Scanner;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/17 - 下午7:52
 * @Description: cn.com.dhc.io04
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 得到的是标准的输入流: --> 从键盘输入:
       /* InputStream in = System.in;
        // 调用方法:
        try {
            int n = in.read(); // read方法等待键盘的录入, 所以这个方法是一个阻塞方法
            System.out.println(n);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // 以前案例: 从键盘录入一个int类型的数据:
        // 从上面代码证明, 键盘录入实际上是: System.in
        // 形象的理解: System.in管, 这个管怼到键盘上去了, 所以你从键盘录入的话, 就从这个管到程序中了
        // Scanner的作用: 扫描器: 起扫描作用的, 扫键盘的从这根管出来的数据
        /*Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);*/
        try{
            // 既然Scanner是扫描的作用, 不一定非得扫System.in进来的东西, 还可以扫描其他管的内容:
            Scanner scanner = new Scanner(new FileInputStream(new File("/tmp/Test.txt")));
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
