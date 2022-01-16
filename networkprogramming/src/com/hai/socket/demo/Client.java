package com.hai.socket.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 * 客户端
 */
@SuppressWarnings({"all"})
public class Client {
    public static void main(String[] args) {
        // 1. 建立与客户端的连接
        Socket socket  = null;
        OutputStream ops = null;
        InputStream ips = null;
        try {
             socket = new Socket(InetAddress.getLocalHost(), 9999);
             
             // 发送消息
            ops = socket.getOutputStream();
            ops.write("hello, server".getBytes());

            // 写完后，关闭socket
            socket.shutdownOutput();
            // 接收服务器发送的消息
            byte[] buff = new byte[1024];
            ips = socket.getInputStream();
            int readLen;
            while((readLen = ips.read(buff)) != -1) {
                System.out.println(new String(buff, 0, readLen));

            }



        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            // 关闭流
            try {
                ops.close();
                ips.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
