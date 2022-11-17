package cn.com.dhc.io05;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/17 - 下午9:04
 * @Description: cn.com.dhc.io05
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        // DataOutputStream: 将内存中的基本数据类型和字符串的变量  写出  文件中
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(new File("/tmp/Demo.txt")));
            // 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
