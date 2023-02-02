package cn.com.dhc.test04;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/2 - 下午8:30
 * @Description: cn.com.dhc.test04
 * @version: 1.0
 */
public class TestSend { //发送方
    public static void main(String[] args) {
        System.out.println("学生上线");
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8888);
            while (true) {
                // 1. 准备套接字: 指定发送方的端口号
                // 2. 准备数据包
                Scanner sc = new Scanner(System.in);
                System.out.println("学生: ");
                String str = sc.next();
                byte[] bytes = str.getBytes();
                /*
                 * 需要四个参数：
                 * 1. 指的是传送数据转为字节数组
                 * 2. 字节数组的长度
                 * 3. 封装接收方的ip
                 * 4. 指定接收方的端口号
                 * */
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 9999);
                // 发送:
                ds.send(dp);
                if (str.equals("byebye")) {
                    System.out.println("学生下线");
                    break;
                }
                // 接收老师发送回来的信息:
                // 2. 有一个空的数据包, 打算用来接收对方传过来的数据包:
                byte[] b = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(b, b.length);
                ds.receive(dp2); // 接收完以后dp2里面就填充好内容了
                // 4. 取出数据
                byte[] data = dp2.getData();
                String s = new String(data, 0, dp2.getLength()); // dp.getLength()数组包中的有效长度
                System.out.println("老师对我说: " + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            ds.close();
        }
    }
}
