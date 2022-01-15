package com.hai.iostream.processingstream;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
public class BufferedReader_ {
    public static void main(String[] args) {
        // BufferReader 和BufferedWrite
        // 在关闭处理流时，底层会自动关闭对应的节点流
        // BufferReader 常用于处理字符流文件


    }

    @Test
    public void readFile() {
        String filePath = "E:\\tmp\\hello.txt";

        //创建处理流文件
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(filePath));
            // 按行读取
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
