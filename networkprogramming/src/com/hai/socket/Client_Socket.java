package com.hai.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 * 客户端
 */
@SuppressWarnings({"all"})
public class Client_Socket {
    public static void main(String[] args) {

        OutputStream ops = null;
        Socket socket= null;
        try {
            // 1. 连接服务器端接口
            // 如果连接成功就会返回Socket对象
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("客户器端 = " + socket.getClass());

            // 2. 连接上后，生成Socket对象
            //    通过socket.getOutputStream()，发送消息
            ops = socket.getOutputStream();
            String massaged = "hello, server";
            ops.write(massaged.getBytes("UTF-8"));


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭流，释放资源
            try {
                ops.close();
                socket.close();
                System.out.println("客户端退出了");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
