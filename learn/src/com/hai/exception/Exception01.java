package com.hai.exception;

import java.util.Scanner;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Exception01 {
    public static void main(String[] args) {
        boolean isFlag = true;
        int num = -1;    // 获取键盘输入
        System.out.println("请输入一个整数");
        while(isFlag){
            try{
                num = new Scanner(System.in).nextInt();
                isFlag  = false;
            }catch(Exception e) {
                System.out.println("输入错误，请重新输入一个整数！");
            }
        }
        System.out.println(num);

    }
}
