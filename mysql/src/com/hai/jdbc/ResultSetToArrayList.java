package com.hai.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.hai.jdbc.utils.JDBCUtilsByDruid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 */
@SuppressWarnings({"all"})
public class ResultSetToArrayList {
    public static void main(String[] args) throws Exception {

        // 创建数据源,获取连接
        Connection connection = JDBCUtilsByDruid.getConnection();
        String sql = "select * from admin";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        // 创建ArrayList对象
        ArrayList<Actor> list = new ArrayList<>();

        while(resultSet.next()) {
            String id = resultSet.getString(1);
            String username = resultSet.getString(2);

            list.add(new Actor(id, username));

        }

        JDBCUtilsByDruid.close(resultSet, preparedStatement, connection);

        for (Actor actor : list ) {
            System.out.println(actor.getId() + "\t" + actor.getUsername());

        }

    }
}
