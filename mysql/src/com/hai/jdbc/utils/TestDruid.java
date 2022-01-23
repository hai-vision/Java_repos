package com.hai.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestDruid {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from admin";
        try {
            conn = JDBCUtilsByDruid.getConnection();

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
            JDBCUtilsByDruid.close(resultSet, preparedStatement, conn);
        }

    }
}
