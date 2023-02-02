package cn.com.dhc.test03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Evin_D
 * @Date: 2023/1/31 - 下午8:31
 * @Description: cn.com.dhc.test02
 * @version: 1.0
 */
public class TestServer { // 服务器
    public static void main(String[] args)  {
        System.out.println("服务器启动了");
        ServerSocket serverSocket = null;
        Socket socket = null; // 定义一个计数器, 用来计数客户端的请求
        int count = 0;
        try {
            // 1. 创建套接字: 指定服务器的端口号
            serverSocket = new ServerSocket(8888);
            while (true) { // 加入死循环, 服务器一直监听客户端是否发送数据
                socket = serverSocket.accept();// 阻塞方法: 等待接收客户端的数据, 什么时候接收到数据, 什么时候程序继续向下执行
                // 每次过来的客户端请求靠线程处理：
                new ServerThread(socket).start();
                count++;
                System.out.println("当前是第" + count + "个用户访问我们的服务器, 对应的用户是: " + socket.getInetAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
