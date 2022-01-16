package com.hai.iostream.transformation;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
@SuppressWarnings({"all"})
public class InputStreamReader_ {
    public static void main(String[] args) {
        // 转换流：字节流 --> 字符流

    }

    @Test
    public void readFile () {
        String filePath = "E:\\tmp\\hello.txt";
        File file = new File(filePath);

        // 创建输入流对象
        FileInputStream fps = null;
        // 创建转换流对象
        InputStreamReader isr = null;
        // 创建处理流对象
        BufferedReader br = null;

        char[] ch = new char[10];
        try {
            // 文件不存在就返回
            if (!file.exists()) {
                System.out.println("文件不存在！");
                return;
            }
            /*
                1. 先将FileInputStream 转换为 InputStreamReader
                2. 由于InputStreamReader 是 Reader的实现子类
                3. 再将InputStreamReader 装换为 BufferReader流
             */

            fps = new FileInputStream(file);
            // 指定编码字符集utf-8
            isr = new InputStreamReader(fps,"UTF-8");

            // 使用处理流来操作文件对象
            br = new BufferedReader(isr);

            String str;
            while ( (str = br.readLine()) != null) {
                System.out.println(str);
            }

            System.out.println("\n文件读取成功");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
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

    @Test
    public void writeFile () {
        // 把字节流转换成字符流
        String filePath = "E:\\tmp\\hello.txt";

        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            fos = new FileOutputStream(filePath, true);
            osw = new OutputStreamWriter(fos,"UTF-8");
            osw.write("哈哈哈哈哈");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
