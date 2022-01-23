package com.hai.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 * 使用C3P0连接池创建连接
 *
 */
@SuppressWarnings({"all"})
public class C3P0Conn {

    public static void main(String[] args) {

    }

    @Test
    public void c3p0Connect1 () throws Exception {
        // 创建一个数据源对象
        ComboPooledDataSource cpds = new ComboPooledDataSource();

        // 读取配置文件
        Properties properties = new Properties();
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        //给数据源 comboPooledDataSource 设置相关的参数
        //注意：连接管理是由 comboPooledDataSource 来管理
        cpds.setDriverClass(driver);
        cpds.setUser(user);
        cpds.setPassword(password);
        cpds.setJdbcUrl(url);

        // 设置初始连接数
        cpds.setInitialPoolSize(10);
        // 设置最大连接数量
        cpds.setMaxPoolSize(100);

        // 获取连接
        Connection connection = cpds.getConnection();

    }

    @Test
    public void c3p0_2 () throws Exception {
        // 1. 将c3p0提供的c3p0-config.xml 拷贝到src目录下
        // 2. 该文件指定了连接数据库和连接池的关系

        // 创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource("hai_dataSource");
        // 测试5000次mysql连接
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            // 直接创建连接
            Connection connection = dataSource.getConnection();
            // 关闭数据源
            connection.close();

        }

        long end = System.currentTimeMillis();

        System.out.println("连接耗时：" + (end-start));


    }
}
