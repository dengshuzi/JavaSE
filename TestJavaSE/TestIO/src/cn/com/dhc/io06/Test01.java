package cn.com.dhc.io06;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/26 - 上午11:17
 * @Description: cn.com.dhc.io06
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        // 将内存中的字符串写出到文件中:
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/tmp/Demo.txt")));
        // 将内存中的字符串写出到文件中:
        oos.writeObject("你好");
        // 关闭流:
        oos.close();
    }
}
