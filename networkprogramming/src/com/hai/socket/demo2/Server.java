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
        BufferedReader br = null;
        BufferedWriter bufferedWriter = null;

        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            // 接收客户端发送的字符流消息
            ips = socket.getInputStream();
            isr = new InputStreamReader(ips);

            br = new BufferedReader(isr);
            String str;
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }

            // 向客户端发送消息
            /*
                1. 通过socket获取字节流
                2. 利用转换流OutputStreamWriter 将字节流转换为字符流
                3. 利用BufferedWriter接收转换流
             */

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("hello, client");

            bufferedWriter.flush();
            socket.shutdownOutput();






        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bufferedWriter.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
