package com.hai.jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/22
 * version 1.0
 * 读取文件
 */
@SuppressWarnings({"all"})
public class JDBC03 {
    public static void main(String[] args) throws Exception {
        // 读取配置文件信息
        Properties properties = new Properties();
        // 加载配置文件
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);


        String sql = "SELECT * FROM actor";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        while(resultSet.next()) {
            int anInt = resultSet.getInt(1);
            String string = resultSet.getString(2);
            String string1 = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            String string2 = resultSet.getString(5);
            System.out.println(anInt + "\t"+ string+ "\t"+ string1+ "\t"+ date+ "\t"+ string2);


        }



    }
}
