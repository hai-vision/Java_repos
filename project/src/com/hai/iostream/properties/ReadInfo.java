package com.hai.iostream.properties;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
@SuppressWarnings({"all"})
public class ReadInfo {
    public static void main(String[] args) {



    }

    @Test
    public void readFile () {
        String filePath = "E:\\tmp\\mysql.txt";

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            Object obj = ois.readObject();

            // 向下转型
            MysqlInfo mysql = (MysqlInfo) obj;
            System.out.println("ip :" + mysql.getIp()
                    + "\npwd :" + mysql.getPwd()
                    + "\nroot :" + mysql.getRoot());
            System.out.println("读取成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void writeFile () {
        String filePath = "E:\\tmp\\mysql.txt";
        // 创建一个对象流
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(new MysqlInfo("128.0.0.1", "123456", "root"));
            System.out.println("写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
