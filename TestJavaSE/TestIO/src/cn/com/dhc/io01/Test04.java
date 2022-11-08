package cn.com.dhc.io01;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/8 - 下午9:12
 * @Description: cn.com.dhc.io01
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        // 1. 有一个源文件
        File file1 = new File("/tmp/Test.txt");
        // 2. 有一个目标文件
        File file2 = new File("/tmp/Demo.txt");
        // 3. 搞一个输入的管怼到源文件上
        FileReader fileReader = new FileReader(file1);
        // 4. 搞一个输出的管怼到目标文件上
        FileWriter fileWriter = new FileWriter(file2);
        // 5.开始动作:
        // 方式1: 一个字符一个字符的复制:
        /*int n = fileReader.read();
        while (n != -1) {
            fileWriter.write(n);
            n = fileReader.read();
        }*/
        // 方式2: 利用缓冲字符数组:
        /*char[] ch = new char[5];
        int len = fileReader.read(ch);
        System.out.println(len);
        while (len != -1) {
            fileWriter.write(ch, 0, len); // 将缓冲数组中有效长度写出
            len = fileReader.read();
        }*/
        // 方式3: 利用缓冲字符数组, 将数组转为String写出:
        char[] ch = new char[5];
        int len = fileReader.read(ch);
        while (len != -1) {
            String str = new String(ch, 0, len);
            fileWriter.write(str);
            len = fileReader.read();
        }
        // 6. 关闭流: (关闭流的时候, 倒着关闭, 后用先关)
        fileWriter.close();
        fileReader.close();
    }
}
