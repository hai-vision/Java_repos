package com.hai.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author hai
 * @date 2022/1/22
 * version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork {

    public static void main(String[] args) throws Exception {


        /*
            要求
            1、 创建admin表
            2、 使用PreparedStatement 添加5条数据
            3、 修改tom的记录，将username改为king
            4、 删除一条记录
            5、 查询全部记录，并显示在控制台
         */

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        // 注册Driver
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "create table `admin` (id tinyint primary key auto_increment, username varchar(32) not null)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //int i = preparedStatement.executeUpdate();
        //System.out.println(i == 0? "创建成功":"创建失败");

        String alter_name = "tom";
        String table_name = "admin";
        String column_name = "username";
        String new_name = "king";
        sql = "update admin set username = ? where username=?";
        preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, new_name);

        preparedStatement.setString(2, alter_name);

        preparedStatement.executeUpdate();


    }

    public static boolean insertVal(int insertCount, Connection connection) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        String user_name = "";

        try {
            while (count <= insertCount) {

                System.out.print("请输入用户名：");
                user_name = scanner.next();

                String sql = "insert into admin(username) values(?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user_name);
                preparedStatement.executeUpdate();
                count++;

            }
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }


}



