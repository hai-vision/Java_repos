package com.hai.socket.demo5;

import com.hai.socket.demo4.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
public class Server {
    public static void main(String[] args) throws Exception{
        // 创建服务端端
        ServerSocket serverSocket = new ServerSocket(9999);
        // 监听9999端口
        System.out.println("服务器正在监听9999端口");
        Socket socket = serverSocket.accept();

        // 通过socket对象，创建输入流对象
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        // 调用工具包，读取通道文件，并存放在字节数组中
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        // 创建输出流，将字节数组内容写入执行文件
        String filePath = "src\\eason3.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);
        bos.close();

        // 向客户端发送消息
        OutputStream ops = socket.getOutputStream();
        ops.write("图片已收到！".getBytes());


        socket.shutdownOutput();
        ops.close();
        socket.close();
        serverSocket.close();


    }
}
