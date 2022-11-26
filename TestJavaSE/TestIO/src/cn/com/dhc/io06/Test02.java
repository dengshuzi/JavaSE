package cn.com.dhc.io06;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/26 - 上午11:21
 * @Description: cn.com.dhc.io06
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 将文件中保存的字符串读入到内存:
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/tmp/Demo.txt")));
        // 读取:
        String s = (String) (ois.readObject());
        System.out.println(s);
        // 关闭流:
        ois.close();
    }
}
