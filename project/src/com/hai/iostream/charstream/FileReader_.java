package com.hai.iostream.charstream;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile () {
        String path = "E:\\tmp\\hello.txt";
        char[] ch = new char[10];

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
            int readLength = 0;
            while ((readLength = fileReader.read(ch)) != -1) {
                System.out.print(new String(ch, 0, readLength));

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void writeFile () {
        String path = "E:\\tmp\\newHello.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(path);
            // FileWrite写文件，只有当close()或者flush才会将写入的内容加载到磁盘文件中


            fw.write("name");
            System.out.println("写入成功！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
