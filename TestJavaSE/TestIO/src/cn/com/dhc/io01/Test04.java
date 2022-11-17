package cn.com.dhc.io01;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/8 - 下午9:12
 * @Description: cn.com.dhc.io01
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        // 1. 有一个源文件
        File file1 = new File("/tmp/Test.txt");
        // 2. 有一个目标文件
        File file2 = new File("/tmp/Demo.txt");
        // 3. 搞一个输入的管怼到源文件上
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(file1);
            // 4. 搞一个输出的管怼到目标文件上
            fileWriter = new FileWriter(file2);
            // 5.开始动作:
            char[] ch = new char[5];
            int len = fileReader.read(ch);
            while (len != -1) {
                String str = new String(ch, 0, len);
                fileWriter.write(str);
                len = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 6. 关闭流: (关闭流的时候, 倒着关闭, 后用先关)
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
