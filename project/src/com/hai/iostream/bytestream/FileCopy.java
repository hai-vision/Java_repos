package com.hai.iostream.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */

@SuppressWarnings({"all"})
public class FileCopy {
    // 文件拷贝
    /*
        1. 将某一路径下的文件，拷贝到指定的路径下
     */
    public static void main(String[] args) {
        String srcPath = "E:\\tmp\\info.txt";
        String decsPath = "D:\\";

        if(!copyContant(srcPath, decsPath)) {
            System.out.println("拷贝失败！");
        }else {
            System.out.println("拷贝成功！");
        }


    }

    public static boolean copyContant (String src, String desc){
        String str = readFile(src);
        if (str == null) {
            return false;
        }
        return writeFile(src, desc, str);

    }

    public static String readFile (String fileName) {
        // 将读取的内容存放在字节数组中
        byte[] bytes = new byte[1024];

        String s = "";
        // 创建输出流对象
        FileInputStream fps = null;
        try {
            fps = new FileInputStream(fileName);
            int readLength = 0;
            while((readLength = fps.read(bytes))!= -1){
                s += new String(bytes, 0, readLength);
            }
            System.out.println("读取完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fps.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return s;
    }

    public static boolean writeFile (String filePath, String fileName, String string) {
        // 创建输出流对象
        File file = new File(filePath);
        String fname = file.getName();

        fileName += fname;


        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName, true);
            fos.write(string.getBytes());
            System.out.println("写入完成");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
