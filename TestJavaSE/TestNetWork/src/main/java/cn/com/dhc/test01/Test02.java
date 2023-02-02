package cn.com.dhc.test01;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @Auther: Evin_D
 * @Date: 2023/1/31 - 下午8:15
 * @Description: cn.com.dhc.test01
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("192.168.1.106", 8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}
