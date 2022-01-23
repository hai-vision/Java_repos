package com.hai.jdbc.transaction;

import com.hai.jdbc.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Transaction_ {
    public static void main(String[] args) {
        // 事务练习


        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            // 得到连接
            conn = JDBCUtils.getConnection();
            // 关闭自动提交事务, 相当于开启事务
            conn.setAutoCommit(false);
            // 处理sql
            String sql = "update account set balance= balance-100 where id=1";
            // 创建PrepareStatement对象
            preparedStatement = conn.prepareStatement(sql);
            // 执行
            preparedStatement.executeUpdate();

            int i = 1 / 0;

            sql = "update account set balance= balance+100 where id=2";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.executeUpdate();

            // 提交事务
            conn.commit();

            System.out.println("执行成功！");


        } catch (Exception e) {
            // sql 语句发生异常时，回滚
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, conn);
        }

    }


}
