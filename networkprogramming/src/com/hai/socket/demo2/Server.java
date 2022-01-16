package com.hai.socket.demo2;

import java.io.*;
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

        ServerSocket serverSocket = null;
        InputStream ips = null;
        InputStreamReader isr = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            // 接收客户端发送的字符流消息
            ips = socket.getInputStream();
            isr = new InputStreamReader(ips);
            char[] buff = new char[64];
            int readLen;
            while ((readLen = isr.read(buff)) != -1) {
                System.out.println(new String(buff, 0, readLen));
                
            }






        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                ips.close();
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
