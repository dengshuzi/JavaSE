package cn.com.dhc.io05;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/17 - 下午9:04
 * @Description: cn.com.dhc.io05
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // DataOutputStream: 将内存中的基本数据类型和字符串的变量  写出  文件中
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(new File("/tmp/Demo.txt")));
            // 向外将变量写到文件中去:
            dos.writeUTF("你好");
            dos.writeBoolean(false);
            dos.writeDouble(6.9);
            dos.writeInt(82);
            // 关闭流:
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
