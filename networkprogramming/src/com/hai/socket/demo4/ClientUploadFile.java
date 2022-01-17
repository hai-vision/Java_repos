package com.hai.socket.demo4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
@SuppressWarnings({"all"})
public class ClientUploadFile {
    public static void main(String[] args) throws Exception {
        // 1. 创建输入流，从磁盘中读取待上传文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\eason.jpg"));
        // 2. 调用工具包，读取文件中的字节信息
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 3. 创建Socket对象，与服务器建立连接
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 4. 通过socket对象，创建输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 5. 将字节数组信息写入数据通道
        bos.write(bytes);
        bis.close();
        // 6. 设置结束标志
        socket.shutdownOutput();

        //=====接收从服务端回复的消息=====
        InputStream ips = socket.getInputStream();
        String s = StreamUtils.streamToString(ips);
        System.out.println(s);
        // 8. 关闭相关的流
        ips.close();
        bos.close();
        socket.close();
    }
}
