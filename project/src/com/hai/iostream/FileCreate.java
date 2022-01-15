package com.hai.iostream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
@SuppressWarnings({"all"})
public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void create01 () {
        // 在内存中创建文件对象
        String fileName = "E:\\news.txt";
        File file = new File(fileName);

        // 在磁盘中创建文件
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void create02 () {
        File preFile = new File("E:\\tmp\\");
        String chileFile = "new1.txt";

        File file = new File(preFile, chileFile);

        try {
            file.createNewFile();
            System.out.println("create success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create03 () {
        String preFile = "E:\\tmp\\";
        String chileFile = "news2.txt";

        // 创建文件对象
        File file = new File(preFile, chileFile);
        try {
            file.createNewFile();
            System.out.println("创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
