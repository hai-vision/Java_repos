package com.hai.iostream.homework;

import java.io.File;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String filePath = "E:\\mytmp\\";
        File file = new File(filePath);

        // 判断该文件夹是否存在，如果不存在则创建
        if(!file.exists()) {
            file.mkdir();
        }

        // 在该文件夹下创建hello.txt
        filePath += "\\hello.txt";

        try {
            file = new File(filePath);
            if (file.exists()) {
                System.out.println("文件已存在");
                return;
            }
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
