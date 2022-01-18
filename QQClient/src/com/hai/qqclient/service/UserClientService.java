package com.hai.qqclient.service;

import com.hai.qqcommon.Message;
import com.hai.qqcommon.MessageType;
import com.hai.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 * 该类完成用户登录和注册等功能
 */
@SuppressWarnings({"all"})
public class UserClientService {

    // 可能在其他地方可能使用以下对象
    private User user = new User();
    Socket socket = null;

    public boolean checkUser (String userId, String pwd) {



        // 根据传入的userId、和pwd 创建User对象
        user.setUserID(userId);
        user.setPasswd(pwd);

        // 连接服务端，发送user对象
        try {
            // 建立与服务器端的连接
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            // 通过socket.getOutputStream()返回输出流对象
            OutputStream ops = socket.getOutputStream();
            // 利用对象流，将对象数据写入数据通道
            ObjectOutputStream oos = new ObjectOutputStream(ops);
            oos.writeObject(user);
            oos.flush();
            // 设置结束标志
            socket.shutdownOutput();

            // 读取从服务端发送的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Object obj = ois.readObject();
            // 向下转型
            Message message = (Message) obj;
            // 根据Message对象中的MessType，判断是否验证成功
            if (message.getMessType().equals(MessageType.MESSAGE_LOGIN_FAIL)) { // 登录成功
                // 创建一个和服务器端保持通讯的线程 --> 创建一个线程类 ClientConnectServerThread

            }




        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return true;

    }
}
