package cn.com.dhc.io03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/17 - 下午7:04
 * @Description: cn.com.dhc.io03
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 文件 --> 程序:
        File file1 = new File("/tmp/Test.txt");
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream(file1);
            // 将字节转换为字符的时候, 需要指定一个编码, 这个编码跟文件本身的编码格式同一
            // isr = new InputStreamReader(fis, "utf-8");
            // 获取程序本身的编码格式
            isr = new InputStreamReader(fis);
            char[] ch = new char[20];
            int len = isr.read(ch);
            while (len != -1) {
                System.out.print(new String(ch, 0, len));
                len = isr.read(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null) {
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
