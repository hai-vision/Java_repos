package com.hai.socket.demo6;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(),
                9999);

        OutputStream ops = socket.getOutputStream();
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(ops);
        oos.writeObject(new Dog("大黄", 2));
        oos.close();
        socket.close();
    }
}
