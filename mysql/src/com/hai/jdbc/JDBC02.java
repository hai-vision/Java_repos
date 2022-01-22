package com.hai.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/22
 * version 1.0
 *
 */
@SuppressWarnings({"all"})
public class JDBC02 {

    @Test
    public void connect01() throws Exception {
        // 利用反射机制，动态创建Driver对象
        Class<?> cls = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) cls.newInstance();


        String url = "jdbc:mysql://localhost:3306/javaDB";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "hai");

        Connection connect = driver.connect(url, properties);
        System.out.println(connect);

        String sql = "insert into actor values (null, 'tylor', '女', '1989-10-23', 112)";
        Statement statement = connect.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i>0?"success":"fail");

        statement.close();
        connect.close();
    }

    @Test
    public void connect02() throws Exception {
        Class<?> cls = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) cls.newInstance();

        String url = "jdbc:mysql://localhost:3306/javaDB";
        String user = "root";
        String password = "hai";
        DriverManager.registerDriver(driver); // 注册Driver驱动
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into actor values(null, '张杰', '男', '1987-12-09', 114)";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i > 0 ? "成功":"失败");

    }

}
