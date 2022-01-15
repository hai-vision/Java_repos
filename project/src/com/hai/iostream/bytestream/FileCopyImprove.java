package com.hai.iostream.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/15
 * version 2.0
 */
@SuppressWarnings({"all"})
public class FileCopyImprove {
    public static void main(String[] args) {
        String srcPath = "E:\\tmp\\系统功能.png";
        String destPath = "D:\\系统功能.png";

        byte[] buff = new byte[1024];

        // 创建输入输出流对象
        FileInputStream fps = null;
        FileOutputStream fos = null;
        try {
            fps = new FileInputStream(srcPath);
            fos = new FileOutputStream(destPath);

            int readLength = 0;
            while((readLength = fps.read(buff)) != -1){
                fos.write(buff);
            }
            System.out.println("拷贝成功！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fps != null){
                    fps.close();
                }
                if (fos != null ){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
