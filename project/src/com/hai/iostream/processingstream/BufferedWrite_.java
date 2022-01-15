package com.hai.iostream.processingstream;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
public class BufferedWrite_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile () {
        String filePath = "E:\\yj.txt";

        BufferedWriter bw = null;
        try {

            bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write("hello world");
            // 插入一个和系统相关的换行符
            //bw.newLine();
            bw.write("java");
            //bw.newLine();



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
