package com.hai.socket.demo3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Client {
    public static void main(String[] args) {
        // 建立与服务器的端口连接
        Socket socket = null;
        OutputStream ops = null;
        InputStream ips = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            // 通过socket对象，创建OutputStream输出对象
            ops = socket.getOutputStream();
            // 1. 从指定目录中读取文件
            bis = new BufferedInputStream(new FileInputStream("src\\com\\hai\\socket\\demo3\\eason.jpg"));
            // 2. 利用处理流将读取的字节数据，通过BufferedOutputStream对象，写入通道
            // 获取OnputStream对象
            ops = socket.getOutputStream();
            bos = new BufferedOutputStream(ops);

            // 创建字节缓冲数组，用于存放bis读取出的字节数据
            byte[] buff = new byte[1024];

            int readLen;
            while ((readLen = bis.read()) != -1) {
                bos.write(buff, 0, readLen);
            }
            bos.flush();
            // 设置结束标志
            socket.shutdownOutput();

            // 接收服务发送的消息
            ips = socket.getInputStream();
            bis = new BufferedInputStream(ips);

            while ((readLen = bis.read(buff)) !=-1) {
                System.out.println(new String(buff, 0, readLen));
            }
            System.out.println();


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
