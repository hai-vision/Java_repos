package com.hai.iostream.bytestream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile () {
        String name = "E:\\tmp\\ino.txt";
        File file = new File(name);
        byte[] contents = {1,2,3,4,5,6,7,8,9};





        // 创建输出流对象
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            String str = "你好";

            outputStream.write(str.getBytes());
            System.out.println("写入成功！");
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();

        }catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
