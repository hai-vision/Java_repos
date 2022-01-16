package com.hai.iostream.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
public class Properties02 {
    public static void main(String[] args) {
        // 使用Properties 类来创建配置文件
        // set方法，如果字段存在，新添加的则会替换
        Properties properties = new Properties();
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "ball");
        properties.setProperty("pwd", "123456");

        // 将配置存放到mysql1.properties中
        try {
            properties.store(new FileWriter("src\\com\\hai\\iostream\\properties\\mysql2.properties"),null);
            System.out.println("配置成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
