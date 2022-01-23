package com.hai.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Druid_ {
    public static void main(String[] args) throws Exception {
        // 创建Properties对象
        Properties properties = new Properties();
        // 加载druid.properties
        properties.load(new FileInputStream("src/druid.properties"));

        // 创建一个指定参数的数据库连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            // 创建连接
            Connection connection = dataSource.getConnection();
            connection.close();
        }

        long end = System.currentTimeMillis();
        System.out.println("德鲁伊连接耗时：" +(end-start));

    }
}
