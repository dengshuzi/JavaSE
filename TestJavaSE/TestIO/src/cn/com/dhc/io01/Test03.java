package cn.com.dhc.io01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/8 - 下午8:38
 * @Description: cn.com.dhc.io01
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        // 1. 有个目标文件:
        File file = new File("/tmp/demo.txt");
        // 2. FileWrite管怼到文件上去:
        FileWriter fileWriter = new FileWriter(file);
        // 3. 开始动作: 输出动作:
        // 一个字符一个字符的往外输出:
        String str = "aaa";
        // for (int i = 0; i < str.length(); i++) {
        //     fileWriter.write(str.charAt(i));
        // }
        // 利用缓冲数组输出:
        char[] chars = str.toCharArray();
        fileWriter.write(chars);
        // 4. 关闭流:
        fileWriter.close();
    }
}
