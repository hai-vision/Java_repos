package com.hai.socket.demo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
@SuppressWarnings({"all"})

public class Server {
    public static void main(String[] args) {
        // 创建ServerSocket对象，对目标端口进行监听
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream ips = null;
        OutputStream ops = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("服务端在9999端口进行监听...");
            // 当客户端连接则返回socket对象
            socket = serverSocket.accept();
            // 通过Socket对象创建InputStream输入流流对象
            ips = socket.getInputStream();
            // 创建BufferedInputStream处理流对象
            bis = new BufferedInputStream(ips);
            // 创建BufferedOutputStream对象，用于将读取的字节信息存放到指定目录
            bos = new BufferedOutputStream(new FileOutputStream("src\\eason.jpg"));
            // 创建字节缓冲数组，用于接收字节信息
            byte[] buff = new byte[1024];
            int readLen;
            while ((readLen = bis.read(buff)) != -1) {
                // 文件读取完毕后即写入
                bos.write(buff, 0, readLen);
            }

            // 通过Socket对象创建OutputStream输出流对象
            ops = socket.getOutputStream();
            // 通过BufferedOutputStream，将消息写入到socket通道
            bos = new BufferedOutputStream(ops);
            bos.write("收到图片".getBytes());
            // 刷新内存，将消息写入通道
            bos.flush();
            // 设置会话结束标志
            socket.shutdownOutput();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                bos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
