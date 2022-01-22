package com.hai.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/22
 * version 1.0
 */
@SuppressWarnings({"all"})
public class JDBC04 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        properties.load(new FileInputStream("src/mysql.properties"));
        String user=properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        // 注册driver
        Class.forName(driver);

        // 获得连接
        Connection connection = DriverManager.getConnection(url, user, password);

        // sql 语句的问号，相当于占位符
        String name = "赵小雷";
        int id = 1;
        String sql = "select * from actor where name = ? and id = ?";
        // 创建预处理对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            id = resultSet.getInt(1);
            name = resultSet.getString(2);
            System.out.println(id + "\t" + name);

        }


    }
}
