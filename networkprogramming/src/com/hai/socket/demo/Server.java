package com.hai.socket.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 * 服务器
 */
@SuppressWarnings({"all"})
public class Server {
    public static void main(String[] args) {
        // 创建 ServerSocket , 初始化服务器端口号
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream ips = null;
        OutputStream ops =null;
        try {
            // 对服务器端口进行监听，
            serverSocket = new ServerSocket(9999);
            // 如果有客户端连接，就返回一个socket对象
            socket = serverSocket.accept();

            // 接收客户端发送的消息
            // 接收输入的字节
            byte[] buff = new byte[1024];
            ips = socket.getInputStream();
            int readLen;
            while((readLen = ips.read(buff)) != -1) {
                System.out.println(new String(buff, 0, readLen));

            }

            // 发送消息给客户端
            ops = socket.getOutputStream();
            ops.write("hello,client".getBytes());

            // 写完后，关闭socket
            socket.shutdownOutput();




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                ips.close();
                ops.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
