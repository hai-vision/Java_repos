package com.hai.iostream.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        // 使用BufferedReader 读取一个文本文件，为每行加上行号
        // 连同内容一并输出到屏幕上

        String filePath = "e:\\tmp\\hello.txt";
        // 创建BufferedReader对象
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String str;
            int row = 0;
            // 循环读取
            while((str = br.readLine())!= null) {
                System.out.println((row + 1) + ". " + str);
                row++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
