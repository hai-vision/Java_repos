package com.hai.socket.demo2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

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
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            // 向服务器发送字符流消息
            ops = socket.getOutputStream();
            // 创建转换流文件
            osw = new OutputStreamWriter(ops);
            bw= new BufferedWriter(osw);
            bw.write("hello, server");

            // 只有刷新后，消息才会加载到Socket通道
            bw.flush();
            socket.shutdownOutput();

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }





        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                br.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
