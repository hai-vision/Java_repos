package com.hai.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/22
 * version 1.0
 * JDBC工具类
 */
@SuppressWarnings({"all"})
public class JDBCUtils {
    private static String url;
    private static String user;    // 用户
    private static String password;
    private static String driver;  // 驱动

    static {
        // 将上述四种属性方法静态代码块内进行初始化
        // 创建Properties对象，用于读取配置文件
        Properties properties = new Properties();
        // 载入配置mysql文件
        try {
            properties.load(new FileInputStream("src/mysql.properties"));
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");


        } catch (IOException e) {
            // 将编译类型转化为运行类型抛出
            throw new RuntimeException(e);
        }
    }

    /*
        获取连接
     */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);

        } catch (SQLException throwables) {
            // 将编译类型转化为运行类型抛出
            throw new RuntimeException(throwables);
        }
    }

    /*
        关闭连接
        1. 可能的连接 ResultSet、Connection、Statement、PrepareStatement
     */

    public static void close(ResultSet set, Connection conn, Statement statement) {
        try {
            if (set!= null ) {
                set.close();
            }
            if (conn != null) {
                conn.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException throwables) {
            // 将编译类型转化为运行类型抛出
            throw new RuntimeException(throwables);
            

        }
    }
}
