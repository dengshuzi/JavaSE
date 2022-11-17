package cn.com.dhc.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/14 - 下午7:23
 * @Description: cn.com.dhc.io02
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        File file1 = new File("/home/d/Pictures/Guo.jpg");
        File file2 = new File("/home/d/Pictures/Demo.jpg");
        try {
            inputStream = new FileInputStream(file1);
            outputStream = new FileOutputStream(file2);
            // 利用缓冲数组:
            byte[] b = new byte[1024];
            int len = inputStream.read(b);
            long starTime = System.currentTimeMillis();
            while (len != -1) {
                outputStream.write(b, 0, len);
                len = inputStream.read(b);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("复制完成的时间为:" + (endTime - starTime));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
