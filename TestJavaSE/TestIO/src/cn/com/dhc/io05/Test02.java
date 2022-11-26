package cn.com.dhc.io05;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/26 - 上午11:09
 * @Description: cn.com.dhc.io05
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        // DataInputStream: 将文件中存储的基本数据类型和字符串写入内存的变量中
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("/tmp/Demo.txt")));
        // 将文件中内容读取到程序中来:
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());
        dis.close();
    }
}
