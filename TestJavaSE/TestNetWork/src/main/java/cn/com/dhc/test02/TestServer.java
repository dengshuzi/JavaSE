package cn.com.dhc.test02;

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
    public static void main(String[] args) throws IOException {
        // 1. 创建套接字: 指定服务器的端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        // 2. 等着客户端来的信息:
        Socket socket = serverSocket.accept();// 阻塞方法: 等待接收客户端的数据, 什么时候接收到数据, 什么时候程序继续向下执行
        // accept() 返回值为一个Socket, 这个Socket其实就是客户端的Socket
        // 接到这个Socket以后, 客户端和服务器才真正产生了连接, 才真正可以通信了
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        // 4. 读取客户端发来的数据:
        String str = dataInputStream.readUTF();
        System.out.println("客户端发来的数据为: " + str);

        // 向客户端输出一句话: ==> 操作流 ==> 输出流
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("你好, 我是服务器端, 我接受到你的请求了");

        // 5. 关闭流 + 关闭网络资源
        dataOutputStream.close();
        outputStream.close();
        dataInputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
