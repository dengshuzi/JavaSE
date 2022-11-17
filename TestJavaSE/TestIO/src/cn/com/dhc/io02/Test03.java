package cn.com.dhc.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/9 - 下午8:15
 * @Description: cn.com.dhc.io02
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        File file = new File("/home/d/Pictures/Guo.jpg");
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024*50];
            int len = inputStream.read(bytes); // len指的就是读取的数组中的有效长度
            while (len != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.println(bytes[i]);
                }
                len = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
