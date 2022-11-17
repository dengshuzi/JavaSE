package cn.com.dhc.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/9 - 下午8:08
 * @Description: cn.com.dhc.io02
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        File file1 = new File("/home/d/Pictures/Guo.jpg");
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file1);
            int count = 0; // 定义一个计数器, 用来计读入的字节的个数
            int n = inputStream.read();
            while (n != -1) {
                count++;
                System.out.println(n);
                n = inputStream.read();
            }
            System.out.println("count = " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
    }
}
