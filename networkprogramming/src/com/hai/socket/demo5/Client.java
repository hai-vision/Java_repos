package com.hai.socket.demo5;

import com.hai.socket.demo4.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 创建连接
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 创建字节输入流（BufferedInputStream），读取磁盘中的图片文件
        String filePath = "src\\eason.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        // 调用工具包，读取图片文件
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        // 创建输出流文件，将字节数组写入通道
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bos.flush();
        bis.close();

        // 设置结束标志
        socket.shutdownOutput();

        InputStream ips = socket.getInputStream();
        String s = StreamUtils.streamToString(ips);
        System.out.println(s);

        ips.close();
        bos.close();
        socket.close();


    }
}
