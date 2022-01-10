package com.hai.homework;

import java.util.Scanner;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class RegisterVerify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            try {
                System.out.print("请输入用户名：");
                String name = input.next();
                verifyUserName(name);

                System.out.println("请输入密码：");
                String pwd = input.next();
                verifyPassword(pwd);

                System.out.print("请输入邮箱：");
                String email = input.next();
                verifyEmail(email);

                System.out.print("注册成功");
                break;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    public static void verifyUserName(String userName){
        if(!(userName.length() >= 2 && userName.length() <= 4)) {
            // 抛出一个异常
            throw new RuntimeException("用户名长度应为2/3/4");
        }
    }

    public static void verifyPassword(String password) {
        if(!isDigit(password)) {
            throw new RuntimeException("密码必须全为数字");
        }
        if(password.length() != 6){
            throw new RuntimeException("密码长度必须为6");
        }
    }

    public static void verifyEmail (String email) {
        if(!isEmail(email)) {
            throw new RuntimeException("邮箱格式不正确");
        }
    }


    public static boolean isDigit(String str) {
        // 将字符串转为字符数组
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!(chars[i] >= '0' && chars[i] <= '9')){
                return false;
            }

        }
        return true;
    }

    public static boolean isEmail(String email) {
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");
        if( !(index1 != -1 && index2 != -1 && index1 < index2 )) {
            return false;
        }
        return true;
    }


}
