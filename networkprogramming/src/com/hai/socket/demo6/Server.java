package com.hai.socket.demo6;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器正在监听9999端口...");
        Socket socket = serverSocket.accept();
        InputStream ips = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(ips);
        Object obj = ois.readObject();
        Dog dog = (Dog)obj;
        System.out.println(dog.getName() + "-" + dog.getAge() );
        ois.close();
        socket.close();


    }
}
