package com.hai.socket.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
        Socket socket = null;
        OutputStream ops = null;
        OutputStreamWriter osw = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            // 向服务器发送字符流消息
            ops = socket.getOutputStream();
            // 创建转换流文件
            osw = new OutputStreamWriter(ops);
            osw.write("hello, server");
            // 设置输出结束标志
            socket.shutdownOutput();



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                ops.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
