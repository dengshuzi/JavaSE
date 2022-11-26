package cn.com.dhc.io07;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/26 - 上午11:28
 * @Description: cn.com.dhc.io07
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 序列化: 将内存中对象 --> 文件:
        Person p = new Person("张三", 19);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/tmp/Demo01.txt")));
        oos.writeObject(p);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/tmp/Demo02.txt")));
        Person person = (Person) (ois.readObject());
        System.out.println(person);
        ois.close();
    }
}
