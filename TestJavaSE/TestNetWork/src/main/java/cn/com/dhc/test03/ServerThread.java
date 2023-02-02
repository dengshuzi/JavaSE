package cn.com.dhc.test03;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/2 - 下午8:14
 * @Description: cn.com.dhc.test03
 * @version: 1.0
 */
public class ServerThread extends Thread { // 线程: 专门处理客户端的请求
    InputStream inputStream = null;
    ObjectInputStream objectInputStream = null;
    OutputStream outputStream = null;
    DataOutputStream dataOutputStream = null;
    Socket socket = null;
    public ServerThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            // 2. 等着客户端来的信息:
            // accept() 返回值为一个Socket, 这个Socket其实就是客户端的Socket
            // 接到这个Socket以后, 客户端和服务器才真正产生了连接, 才真正可以通信了
            inputStream = socket.getInputStream();
            objectInputStream = new ObjectInputStream(inputStream);

            // 4. 读取客户端发来的数据:
            User user = (User) (objectInputStream.readObject());

            // 对对象进行验证:
            boolean flag = false;
            if(user.getName().equals("张三") && user.getPwd().equals("123")) {
                flag = true;
            }

            // 向客户端输出一句话: ==> 操作流 ==> 输出流
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeBoolean(flag);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
