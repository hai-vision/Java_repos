package com.hai.homework.demo1;

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
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器正在监听9999端口");
        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s;
        String receivedMessage = "";
        while ((s=br.readLine()) != null) {
            receivedMessage = s;
            System.out.println(s);
        }



        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
                (socket.getOutputStream()));

        if (receivedMessage.equals("name")) {
            bw.write("nova");
        } else if (receivedMessage.equals("hobby")) {
            bw.write("编写Java程序");
        } else {
            bw.write("你说啥呢？");
        }

        bw.flush();
        socket.shutdownOutput();



        bw.close();
        socket.close();
        br.close();
        serverSocket.close();

    }
}
