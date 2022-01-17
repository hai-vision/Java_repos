package com.hai.homework.demo1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
                (socket.getOutputStream())) ;

        String sentMessage = "喝了吗";
        bw.write(sentMessage);
        bw.flush();
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s;
        while ((s=br.readLine()) != null) {
            System.out.println(s);
        }

        br.close();
        bw.close();
        socket.close();






    }
}
