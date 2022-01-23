package com.hai.jdbc.batching;

import com.hai.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 * 批处理操作
 */
@SuppressWarnings({"all"})
public class Batche_ {
    public static void main(String[] args) {

        //
    }

    @Test
    public void batch() throws SQLException {
        // 得到连接
        Connection conn = JDBCUtils.getConnection();
        String sql = "insert into admin2(username) values(?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            // sql语句添加到批处理中
            preparedStatement.addBatch();
            // 当有1000条记录，即批量执行
            if ( (i+1) % 1000 == 0) {
                preparedStatement.executeUpdate();
                // 清空批处理
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("批处理执行时间：" + ( end-start));
    }
}
