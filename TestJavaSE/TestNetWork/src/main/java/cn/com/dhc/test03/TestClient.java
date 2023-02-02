package cn.com.dhc.test03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: Evin_D
 * @Date: 2023/1/31 - 下午8:25
 * @Description: cn.com.dhc.test02
 * @version: 1.0
 */
public class TestClient { // 客户端
    public static void main(String[] args) {
        System.out.println("客户端启动了");
        Socket socket = null;
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        try {
            // 1. 创建套接字: 制定服务器的ip和端口号:
            socket = new Socket("192.168.1.106", 8888);

            // 录入用户的账号和密码:
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入您的账号: ");
            String name = sc.next();
            System.out.println("请录入您的密码: ");
            String pwd = sc.next();
            // 将账号和密码封装为一个User对象:
            User user = new User(name, pwd);

            // 2. 对于程序员来说, 向外发送数据 感受 ==> 利用输出流:
            outputStream = socket.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(user);

            // 接收服务器端的回话 ==> 利用输入流:
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            boolean flag = dataInputStream.readBoolean();
            if (flag) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 3. 关闭流 + 网络资源
                if (dataInputStream != null)
                    dataInputStream.close();
                if (inputStream != null)
                    inputStream.close();
                if (objectOutputStream != null)
                    objectOutputStream.close();
                if (outputStream != null)
                    outputStream.close();
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
