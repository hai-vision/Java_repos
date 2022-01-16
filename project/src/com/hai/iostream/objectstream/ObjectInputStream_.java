package com.hai.iostream.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */

@SuppressWarnings({"all"})
public class ObjectInputStream_ {
    public static void main(String[] args) {
        // 读取（反序列化）的顺序要和序列化的顺序一致
        String filename = "e:\\object.dat";
        try {
            ObjectInputStream ops = new ObjectInputStream(new FileInputStream(filename));
            System.out.println(ops.readInt());
            System.out.println(ops.readBoolean());
            System.out.println(ops.readDouble());
            System.out.println(ops.readFloat());
            System.out.println(ops.readUTF());
            System.out.println(ops.readObject());
            Object dog =ops.readObject();
            System.out.println(dog);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}


