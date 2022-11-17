package cn.com.dhc.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/9 - 下午8:41
 * @Description: cn.com.dhc.io02
 * @version: 1.0
 */
public class Test04 {
    // 这是一个main方法, 是程序的入口:
    public static void main(String[] args) {
        // 功能: 完成图片的复制:
        // 1. 有一个源图片:
        File file1 = new File("/home/d/Pictures/Guo.jpg");
        // 2. 有一个目标图片:
        File file2 = new File("/home/d/Pictures/Demo.jpg");
        // 3. 有一个输入的管道怼到源文件:
        FileInputStream inputStream = null;
        // 4. 有一个输出的管道怼到目标文件:
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(file1);
            outputStream = new FileOutputStream(file2);
            // 5. 开始复制
            int n = inputStream.read();
            long starTime = System.currentTimeMillis();
            while (n != -1) {
                outputStream.write(n);
                n = inputStream.read();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("复制完成的时间为:" + (endTime - starTime));
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            // 6. 关闭流(倒着关闭流):
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
