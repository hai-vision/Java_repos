package com.hai.reflect.homework;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author hai
 * @date 2022/1/19
 * version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) throws Exception{
        /*
            1. 利用Class类的forName方法得到File类的class对象
            2. 控制台打印File类的所有构造器对象
            3. 通过newInstance的方法创建file对象，并创建 E:\mynew.txt文件
         */

        Class<?> cls = Class.forName("java.io.File");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);

        }

        // newInstance的方法创建file对象
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class);
        File fileInstance = (File) declaredConstructor.newInstance("E:\\mynew.txt");
        Method createNewFile = cls.getMethod("createNewFile");
        createNewFile.invoke(fileInstance);


    }
}
