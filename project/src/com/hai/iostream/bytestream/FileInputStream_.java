package com.hai.iostream.bytestream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile () {
        int read = 0;
        String filePath = "E:\\tmp\\hello.txt";
        FileInputStream fps = null;
        try {
            fps = new FileInputStream(filePath);


            while(read != -1) {
                read = fps.read();
                System.out.print((char)read);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fps.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void readFile2 () {
        byte[] buff = new byte[8];
        String filePath = "E:\\tmp\\hello.txt";
        FileInputStream fps = null;
        try {
            fps = new FileInputStream(filePath);

            int readLength = 0;
            while((readLength = fps.read(buff))!= -1) {
                System.out.print(new String(buff, 0, readLength));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fps.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
