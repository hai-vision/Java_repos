package com.hai.socket.demo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
public class ServerReceiveFile {
    public static void main(String[] args) throws Exception {
        // 1. 创建服务器端，初始化端口号
        ServerSocket serverSocket = new ServerSocket(9999);
        // 2. 等待客户端连接
        System.out.println("服务器9999端口等待连接...");
        Socket socket = serverSocket.accept();


        // 3. 利用socket.getInputStream创建输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        // 4. 调用工具包，读取通道消息
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 5. 创建输出流对象，将读取的消息写到指定文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\eason1.jpg"));
        bos.write(bytes);


        // 6. 向客户端发送消息
        bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write("收到图片！".getBytes());
        bos.flush();
        // 7. 设置结束标志
        socket.close();

        // 8.关闭相关的流
        bis.close();
        bos.close();
        socket.close();
        serverSocket.close();


    }
}
