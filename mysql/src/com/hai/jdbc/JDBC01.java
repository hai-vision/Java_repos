package com.hai.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/22
 * version 1.0
 * jdbc程序，操作数据库的流程
 */
@SuppressWarnings({"all"})
public class JDBC01 {
    public static void main(String[] args) throws SQLException {
        // 1. 注册驱动
        Driver driver = new Driver();

        // 2. 得到连接
        /*
            1. jdbc:mysql:// 规定好的协议，通过jdbc的方式连接mysql
            2. localhost 主机， 可以是IP地址
            3. 3306 表示mysql监听的端口号
            4. db02 连接到mysql DBMS的哪一个数据库
            5. mysql 连接的本质就是socket连接

         */
        String url= "jdbc:mysql://localhost:3306/javaDB";
        // 将用户名和密码保存到Properties对象中
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "hai");

        Connection connect = driver.connect(url, properties);


        // 3. 执行sql
        String sql = "insert into actor values(null, '赵小雷', '男', '1985-7-20', '119')";
        // 创建一个Statement对象, 用于执行静态SQL语句, 并返回其生成的结果对象
        Statement statement = connect.createStatement();
        // 如果是dml语句，返回的就是影响的行数
        int row = statement.executeUpdate(sql);

        System.out.println(row>0?"success": "fail");

        // 4. 关闭连接资源
        statement.close();
        connect.close();

    }
}
