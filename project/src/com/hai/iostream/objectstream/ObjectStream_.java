package com.hai.iostream.objectstream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 * 完成数据的数序列化
 */
@SuppressWarnings({"all"})
public class ObjectStream_ implements Serializable {
    public static void main(String[] args) {
        /*
            1. 要实现序列化，必须实现Serializable接口
         */



    }

    @Test
    public void outputStream () {
        // 序列化后，保存的文件格式，与存放路径的文件格式无关
        String filename = "e:\\object.dat";
        int nums =10;
        // 创建对象流
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream(filename));
            stream.write(100);
            stream.writeBoolean(true);
            stream.writeDouble(97.2);
            stream.writeFloat(22.1f);
            stream.writeUTF("long");
            stream.writeObject(new Dog());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

class Dog implements Serializable {
    private String name = "小黑";
    private String color = "black";

    public Dog () {

    }

    public Dog (String name, String color) {
        this.name = name;
        this.color = color;
    }

}
