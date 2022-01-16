package com.hai.iostream.objectstream.demo;

import com.hai.iostream.objectstream.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */

@SuppressWarnings({"all"})
public class Exercise {
    public static void main(String[] args) {
        String filePath = "e:\\object.dat";

        ObjectInputStream ops = null;
        try {
            ops = new ObjectInputStream(new FileInputStream(filePath));
            Object dog = ops.readObject();
            System.out.println(dog);
            Dog dog1 = (Dog) dog;
            System.out.println(dog1.getName());




        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            try {
                ops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}






