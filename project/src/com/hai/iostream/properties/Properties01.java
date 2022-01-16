package com.hai.iostream.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
public class Properties01 {
    public static void main(String[] args) {
        // 使用Properties类来加载properties配置文件

        // 1. 创建Properties对象
        Properties properties = new Properties();
        FileWriter fw = null;

        try {
            fw  = new FileWriter("e:\\tmp\\mysql.properties");

            // 2. 加载properties文件
            properties.load(new FileReader("src\\com\\hai\\iostream\\properties\\mysql2.properties"));
            // 3. 把键值对显示到控制台
            properties.list(System.out);

            System.out.println(properties.getProperty("root"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
        }


    }
}
