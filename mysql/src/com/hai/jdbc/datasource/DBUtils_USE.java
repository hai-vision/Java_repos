package com.hai.jdbc.datasource;

import com.hai.jdbc.Actor;
import com.hai.jdbc.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 * DBUtils 工具类的使用
 */
@SuppressWarnings({"all"})
public class DBUtils_USE {
    public static void main(String[] args) throws Exception {
        // 1. 获取连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();

        // 2. 使用DBUtils类和接口，创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner();
        // 3. 执行相关方法，返回ArrayList集合
        String sql = "select * from admin where id>?";
        // 4. query 方法就是执行SQL语句，得到resultSet，并将其封装到ArrayList集合中
        // 5. 返回集合结果
        // 6. connection: druid连接
        // 7. new BeanListHandler<>(Actor.class): 在将resultSet取出放在Actor对象中，再将对象封装到ArrayList中
        //    底层使用反射机制获取Actor的属性，然后进行封装
        // 8: 1，就是给sql语句中的？进行赋值，是可变形参
        List<Actor> query =
                queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);

        for (Actor actor : query) {
            System.out.println(actor);
        }

        // 关闭连接
        // 底层以实现对resultSet、Statement的关闭
        JDBCUtilsByDruid.close(null, null, connection);


    }

    @Test
    public void querySingle() throws Exception {
        // 查询结果返回单条记录
        Connection connection = JDBCUtilsByDruid.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id=?";

        Actor query = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 3);
        System.out.println(query);
        // 释放资源
        JDBCUtilsByDruid.close(null, null,  connection);

    }

    @Test
    public void queryScalar () throws SQLException {
        // 使用 apache + druid 查询，返回的结果是单行单列的数据
        Connection connection = JDBCUtilsByDruid.getConnection();

        String sql = "select username from admin where id = ?";
        QueryRunner queryRunner = new QueryRunner();
        Object query = queryRunner.query(connection, sql, new ScalarHandler(), 1);
        System.out.println(query);
        // 释放资源
        JDBCUtilsByDruid.close(null, null,  connection);

    }

    @Test
    public void testDML() throws SQLException {
        // 使用 apache + druid完成增加、删除、修改
        Connection connection = JDBCUtilsByDruid.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "insert into admin values(?, ?)";
        //affactRows 受影响的行数
        int affactedRows = queryRunner.update(connection, sql, 11, "lin");

        System.out.println(affactedRows > 0? "成功": "失败");

    }
}
