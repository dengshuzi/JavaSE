package cn.com.dhc.io02;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/14 - 下午8:33
 * @Description: cn.com.dhc.io02
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) {
        File file1 = new File("/tmp/Test.txt");
        File file2 = new File("/tmp/Demo.txt");
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader(file1);
            fw = new FileWriter(file2);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            //  方式1: 读取一个字符, 输出一个字符:
            /*int n = br.read();
            while (n != -1) {
                bw.write(n);
                n = br.read();
            }*/

            // 方式2: 利用缓冲数组:
            /*char[] ch = new char[30];
            int len = br.read(ch);
            while (len != -1) {
                bw.write(ch, 0, len);
                len = br.read(ch);
            }*/

            // 方式3: 读取String:
            String readLine = br.readLine(); //每次读取文本文件中一行, 返回字符串
            if (readLine != null) {
                bw.write(readLine);
                // 在文本文件中应该再写出一个换行:
                bw.newLine(); // 新起一行
                readLine = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {

            }
        }
    }
}
