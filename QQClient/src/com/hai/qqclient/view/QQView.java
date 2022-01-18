package com.hai.qqclient.view;

import com.hai.qqclient.utils.Utility;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 */
@SuppressWarnings({"all"})
public class QQView {

    public static void main (String[] args ){
        new QQView().mainView();
    }

    // 循环变量
    private boolean loop = true;
    // 用户输入
    private String key;

    // 显示主菜单
    private void mainView () {
        while (loop) {
            System.out.println("==============欢迎登录网络通讯系统=================");
            System.out.println("\t\t 1. 登录系统 ");
            System.out.println("\t\t 9. 退出系统 ");

            System.out.print("请输入你的选择：");
            key = Utility.readString(1);
            // 根据用户输入来处理不同逻辑
            switch (key) {
                case "1":
                    System.out.print("请输入用户号：");
                    String userId = Utility.readString(15);
                    System.out.print("请输入密  码：");
                    String passwd = Utility.readString(16);
                    // 到服务器验证用户输入是否正确

                    if (true) {
                        // 假设验证成功
                        System.out.println("\n==============欢迎(用户 " + userId + " )=================");
                        // 进入二级菜单
                        while (loop) {
                            System.out.println("\n============网络通信二级菜单(用户 " + userId + " )===========");
                            System.out.println("\t\t 1. 显示在线用户列表 ");
                            System.out.println("\t\t 2. 群发消息 ");
                            System.out.println("\t\t 3. 私聊消息 ");
                            System.out.println("\t\t 4. 发送文件 ");
                            System.out.println("\t\t 9. 退出系统 ");

                            System.out.print("请输入你的选择：");
                            key = Utility.readString(1);

                            switch(key) {
                                case "1":
                                    System.out.println("显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.println("私聊消息");
                                    break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                            }



                        }
                    } else {
                        System.out.println("登录失败");

                    }
                    break;
                case "9":
                    loop = false;
                    break;

            }

        }
    }



}
