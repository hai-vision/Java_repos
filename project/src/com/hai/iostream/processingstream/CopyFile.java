package com.hai.iostream.processingstream;

import java.io.*;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
public class CopyFile {
    public static void main(String[] args) {
        /**
         *  1. 创建BufferedReader处理流对象，用于读取文本内容
         *  2. 创建BufferedWriter处理流对象，用于写入文本内容
         */

        String srcPath = "e:\\tmp\\yj.txt";
        String destPath = "e:\\yj.txt";

        BufferedReader fsp = null;
        BufferedWriter fop = null;

        try {
            fsp = new BufferedReader(new FileReader(srcPath));
            fop = new BufferedWriter(new FileWriter(destPath));

            String line;
            while ((line = fsp.readLine()) !=null) {
                //  每读一行就写入
                fop.write(line);
                fop.newLine();
            }
            System.out.println("拷贝成功！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
                if (fsp != null) {
                    fsp.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
