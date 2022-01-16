package com.hai.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 * 服务器端
 */

@SuppressWarnings({"all"})
public class Serve_Socket {
    public static void main(String[] args) {


        InputStream ips = null;
        Socket socket = null;
        try {
            // 1. 在本机的9999端口进行监听，等待连接
            //    要求在本机没有其他服务在监听9999端口
            //    SocketServer 可以通过accept() 返回多个Socket
            ServerSocket serverSocket = new ServerSocket(9999);

            System.out.println("服务器端在9999端口监听，等待连接" );
            // 当没有客户端连接该端口，程序会被阻塞
            // 2. 如果有 客户端连接，就会返回一个socket对象
            socket = serverSocket.accept();
            System.out.println("服务器端 = " + socket.getClass());

            // 3. 连接上后，生成Socket对象，通过socket.getInputStream()，接受消息
            ips = socket.getInputStream();
            byte[] buff = new byte[64];
            int readLen = 0;
            while((readLen = ips.read(buff)) != -1) {
                System.out.println(new String(buff, 0, readLen));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ips.close();
                socket.close();
                System.out.println("服务器端退出了！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
