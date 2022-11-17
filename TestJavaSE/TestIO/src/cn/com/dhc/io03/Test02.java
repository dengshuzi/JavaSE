package cn.com.dhc.io03;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/17 - 下午7:38
 * @Description: cn.com.dhc.io03
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        File file1 = new File("/tmp/Test.txt");
        File file2 = new File("/tmp/Demo.txt");
        FileInputStream fis = null;
        InputStreamReader isr = null;
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            fis = new FileInputStream(file1);
            isr = new InputStreamReader(fis, "utf-8");
            fos = new FileOutputStream(file2);
            osw = new OutputStreamWriter(fos, "gbk");
            char[] ch = new char[20];
            int len = isr.read(ch);
            while (len != -1) {
                osw.write(ch, 0, len);
                len = isr.read(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null) {
                    osw.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
