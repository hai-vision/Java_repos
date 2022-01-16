package com.hai.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        // 获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        // 根据指定的主机名，获取InetAddress对象
        InetAddress hostName = InetAddress.getByName("DESKTOP-8E5O3UB");
        System.out.println(hostName);

        // 根据域名获取InetAddress
        InetAddress name = InetAddress.getByName("www.tencent.com");
        System.out.println(name);
    }
}
