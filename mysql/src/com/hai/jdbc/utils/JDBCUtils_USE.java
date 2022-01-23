package com.hai.jdbc.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 * 工具类的使用
 */
@SuppressWarnings({"all"})
public class JDBCUtils_USE {
    public static void main(String[] args) {


    }

    @Test
    public void TestDML () {
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "insert into admin values(?,?)";
        sql = "update admin set username=? where id=?";
        sql = "delete from admin where id=?";

        PreparedStatement preparedStatement = null;
        //3. 创建PreparedStatement 对象
        try {
            connection = JDBCUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            //preparedStatement.setInt(1, 8);
            //preparedStatement.setString(2, "jack");
            //preparedStatement.setString(1,"mary");
            preparedStatement.setInt(1, 8);
            //执行
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }

    @Test
    public void TestSelectQuery () {

        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from admin";
        try {
            conn = JDBCUtils.getConnection();

            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int i = resultSet.getInt(1);
                String string = resultSet.getString(2);
                System.out.println(i + "\t" + string);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭连接
            JDBCUtils.close(resultSet, preparedStatement, conn);
        }

    }
}
