package cn.com.dhc.io04;

import com.sun.deploy.util.StringUtils;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/17 - 下午8:45
 * @Description: cn.com.dhc.io04
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        // 1. 先准备输入方向:
        // 键盘录入:
        InputStream in = System.in; // 属于字节流
        // 字节流 --> 字符流:
        InputStreamReader isr = new InputStreamReader(in);
        // 在isr外面再套一个缓冲流:
        BufferedReader br = new BufferedReader(isr);

        // 2. 再准备输出方向:
        File file = new File("/tmp/Demo.txt");
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            String s = br.readLine();
            while (!s.equals("exit")) {
                bw.write(s);
                bw.newLine();
                s = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
