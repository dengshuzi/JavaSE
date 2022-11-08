package cn.com.dhc.io01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/8 - 下午8:13
 * @Description: cn.com.dhc.io01
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        // 文件 --> 程序:
        // 1. 创建一个File类的对象
        File file = new File("/tmp/Test.txt");

        // 2. 创建一个FileReader的流的对象
        FileReader fileReader = new FileReader(file);

        // 3. 读取动作
        // 引入一个快递员的小车, 这个小车一次拉五个快递
        char[] ch = new char[5];
        int len = fileReader.read(ch);// 一次读取五个: 返回值是这个数组中的有效长度
        while (len != -1) {
            // 错误方式:
            /*for (int i = 0; i < ch.length; i++) {
                System.out.println(ch[i]);
            }*/
            // 正确方式1:
            /*for (int i = 0; i < len; i++) {
                System.out.println(ch[i]);
            }*/
            // 正确方式2:
            String str = new String(ch, 0, len);
            System.out.print(str);
            len = fileReader.read(ch);
        }

        // 4. 关闭流
        fileReader.close();
    }
}
