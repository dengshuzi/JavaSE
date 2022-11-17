package cn.com.dhc.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/9 - 下午7:54
 * @Description: cn.com.dhc.io02
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // 功能: 利用字节流将文件中内容读到程序中来:
        // 1. 有一个源文件:
        File file1 = new File("/tmp/Test.txt");
        File file2 = new File("/tmp/Demo.txt");

        // 2. 将一个字节流管怼到源文件上：
        FileInputStream inputStream = null;
        try {
            // 3. 开始读取动作:
            /*
                细节1:
                    文件是utf-8进行存储的, 所以英文字符底层实际占用1个字节
                    但是中文字符, 底层实际占用3个字节
                细节2:
                    如果文件是文本文件, 那么就不要使用字节流读取了, 建议使用字符流
                细节3:
                    read()读取一个字节, 但是你有没有发现返回值是int类型, 而不是byte类型
                    read方法底层做了处理, 让返回数据都是正数
                    就是为了避免如果字节返回的是-1的话, 那到底是读入的字节, 还是到文件结尾呢
             */
            inputStream = new FileInputStream(file1);
            int n = inputStream.read();
            while (n != -1) {
                System.out.println(n);
                n = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流:
            try {
                if (inputStream == null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
