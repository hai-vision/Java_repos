package com.hai.homework.demo2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
@SuppressWarnings({"all"})
public class ClientDownload {
    public static void main(String[] args) {
        /*
            1. 客户端发送歌名给服务器
            2. 客户端接收到服务器发来的音乐后，存放到指定文件
         */

        Socket socket = null;
        InputStream ips = null;
        OutputStream ops = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            String songName = "赵雷";
            // 通过Socket, 创建输出流
            ops = socket.getOutputStream();
            // 写入数据通道
            ops.write(songName.getBytes());
            ops.flush();
            // 设置结束标志
            socket.shutdownOutput();

            // 创建输入流对象
            ips = socket.getInputStream();
            byte[] bytes = StreamUtils.streamToByteArray(ips);
            // 创建输出流，将接收的字节数组存放在指定目录下
            BufferedOutputStream bis = new BufferedOutputStream(new
                    FileOutputStream("e:\\" + "\\" + songName + ".mp3"));
            bis.write(bytes);
            bis.close();




        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ips.close();
                ops.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
