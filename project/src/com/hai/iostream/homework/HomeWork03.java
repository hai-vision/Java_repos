package com.hai.iostream.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        // 实例化Dog对象
        Dog dog = new Dog();
        String filePath = "src\\com\\hai\\iostream\\homework\\dog.properties";
        createFile(filePath);
        // 创建Properties对象
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(filePath));
            //properties.list(System.out);
            //System.out.println(properties.getProperty("name"));
            dog.setName(properties.getProperty("name"));
            dog.setAge(Integer.parseInt(properties.getProperty("age")));
            dog.setColor(properties.getProperty("color"));
            System.out.println("初始化完成");

            System.out.println(dog);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void createFile (String filePath) {
        // 创建Properties对象
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "black");

        // 将配置信息存放到相应文件中
        try {
            properties.store(new FileWriter(filePath), null);
            System.out.println("写入完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
