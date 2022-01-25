package com.xxxx;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/25
 * version 1.0
 */
@SuppressWarnings({"all"})
public class ReadMySQL {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/mysql.properties"));


        //System.out.println(properties.getProperty("user"));
        // 创建数据源
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //System.out.println(dataSource);
        // 创建连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);


    }
}
