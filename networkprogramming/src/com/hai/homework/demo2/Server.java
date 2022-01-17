package com.hai.homework.demo2;

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
    /*
        1. 服务器根据客户端的请求，发送指定的歌曲给客户端
        2. 如果没有则返回默认的音乐即可
     */
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        InputStream ips = null;
        Socket socket = null;
        OutputStream ops = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("服务器正在监听9999端口...");
            // 监听9999端口
            socket = serverSocket.accept();
            ips = socket.getInputStream();
            // 读取数据通道中的内容
            String songName = StreamUtils.streamToString(ips) + ".mp3";
            // 服务器中音频文件的父级目录
            String audioPresentFiles = "src\\";
            String audioChileFiles = audioPresentFiles + "\\" + songName;
            // 创建File对象
            File file = new File(audioChileFiles);
            // 判断文件是否存在
            if (!file.exists()) {
                // 不存在，返回默认音乐
                String defaultMusic = "src\\无名.mp3";
                // 创建输入流文件，读取字节流
                BufferedInputStream bis = new BufferedInputStream(new
                        FileInputStream(defaultMusic));
                byte[] bytes = StreamUtils.streamToByteArray(bis);
                // 创建输出流对象，将字节数组写入数据通道
                ops = socket.getOutputStream();
                ops.write(bytes);
                ops.flush();
                // 关闭输入流
                bis.close();
                // 设置结束标志
                socket.shutdownOutput();

            } else {
                // 创建输入流，读取MP3文件
                BufferedInputStream bis = new BufferedInputStream(new
                        FileInputStream(audioChileFiles));
                byte[] bytes = StreamUtils.streamToByteArray(bis);
                // 创建输出流对象，将字节数组写入数据通道
                ops = socket.getOutputStream();
                ops.write(bytes);
                ops.flush();
                bis.close();
                // 设置结束标志
                socket.shutdownOutput();
            }

            System.out.println("传输完成！");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ops.close();
                ips.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
