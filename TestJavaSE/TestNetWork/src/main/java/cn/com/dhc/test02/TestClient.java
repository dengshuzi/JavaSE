package cn.com.dhc.test02;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Evin_D
 * @Date: 2023/1/31 - 下午8:25
 * @Description: cn.com.dhc.test02
 * @version: 1.0
 */
public class TestClient { // 客户端
    public static void main(String[] args) throws IOException {
        // 1. 创建套接字: 制定服务器的ip和端口号:
        Socket socket = new Socket("192.168.1.106", 8888);
        // 2. 对于程序员来说, 向外发送数据 感受 ==> 利用输出流:
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        // 利用OutputStream就可以向外发送数据了, 但是没有直接发送String的方法
        // 所以我们又在OutputStream外面套了一个处理流: DataOutputStream
        dataOutputStream.writeUTF("你好");

        // 接收服务器端的回话 ==> 利用输入流:
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        System.out.println("服务器端对我说: " + dataInputStream.readUTF());

        // 3. 关闭流 + 网络资源
        dataInputStream.close();
        inputStream.close();
        dataOutputStream.close();
        outputStream.close();
        socket.close();
    }
}
