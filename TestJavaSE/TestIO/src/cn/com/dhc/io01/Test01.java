package cn.com.dhc.io01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/2 - 下午9:44
 * @Description: cn.com.dhc.io01
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        // 文件 --> 程序:
        // 1. 有一个文件: --> 创建一个File类的对象
        File file = new File("/tmp/Test.txt");

        // 2. 利用FileReader这个流, 这个"管"怼到源文件上去 --> 创建一个FileReader的流的对象
        FileReader fileReader = new FileReader(file);

        // 3. 进行操作"吸"的动作 --> 读取动作
        // 下面的代码我们验证了: 如果到了文件的结尾处, 那么读取的内容为-1
        /*int n1 = fileReader.read();
        int n2 = fileReader.read();
        int n3 = fileReader.read();
        int n4 = fileReader.read();
        int n5 = fileReader.read();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);*/

        // 方式一:
        /*int n = fileReader.read();
        while (n != -1) {
            System.out.println(n);
            n = fileReader.read();
        }*/
        // 方式二:
        int n;
        while ((n = fileReader.read()) != -1) {
            System.out.println((char) n);
        }

        // 4. "管"不用了, 就要关闭 --> 关闭流
        // 流, 数据库, 网络资源, 靠jvm本身没有办法帮我们关闭, 此时必须程序员手动关闭:
        fileReader.close();
    }
}
