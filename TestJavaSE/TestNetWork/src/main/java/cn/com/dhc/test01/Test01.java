package cn.com.dhc.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: Evin_D
 * @Date: 2023/1/31 - 下午8:06
 * @Description: cn.com.dhc.test01
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        // 封装IP:
        // InetAddress inetAddress = new InetAddress(); 不能直接创建对象, 因为InteAddress()被default修饰了
        InetAddress ia = InetAddress.getByName("192.168.1.106");
        System.out.println(ia);
        InetAddress ia2 = InetAddress.getByName("localhost"); // localhost指代的是本机的ip地址
        System.out.println(ia2);
        InetAddress ia3 = InetAddress.getByName("127.0.0.1"); // 127.0.0.1指代的是本机的ip地址
        System.out.println(ia3);
        InetAddress ia4 = InetAddress.getByName("kali"); // 封装计算机名
        System.out.println(ia4);
        InetAddress ia5 = InetAddress.getByName("www.baidu.com"); // 封装域名
        System.out.println(ia5);

        System.out.println(ia5.getHostName());
        System.out.printf( ia5.getHostAddress());
    }
}
