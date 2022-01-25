package com.hai.dao_.dao;

import com.hai.dao_.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author hai
 * @date 2022/1/25
 * version 1.0
 * 开发BasicDAO, 其他DAO的父类
 */
@SuppressWarnings({"all"})
public class BasicDAO<T> { // 泛型指定具体的类型

    private QueryRunner qr = new QueryRunner();



    /**
        开发dml语句，针对任意的表
        @ sql : 执行的sql 语句
        @ params: 可变参数
        @ return int: 受影响的行数
     */
    public int update (String sql, Object... params) {

        // 创建Connection 对象
        Connection conn = null;

        // 调用工具类，创建德鲁伊连接
        try {
            conn = JDBCUtilsByDruid.getConnection();
            // 执行SQL语句
            int affectedRows = qr.update(conn, sql, params);
            return affectedRows;

        } catch (SQLException throwables) {
            // 将编译异常转换为运行异常抛出，方便调用者使用
            throw new RuntimeException(throwables);

        } finally {
            // 关闭连接
            JDBCUtilsByDruid.close(null, null ,conn);
        }

    }

    /**
     * 返回多个对象(即查询的结果返回多行)，针对任意表
     * @param sql sql 语句，可以有？
     * @param clazz 传入一个Class对象，比如Actor.class
     * @param params 可变形参？， 可以传入多个具体的？值
     * @return 根据Actor.class 返回对应的ArrayList集合
     */
    public List<T> queryMulti(String sql, Class<T> clazz, Object... params) {

        Connection conn = null;

        try {
            conn = JDBCUtilsByDruid.getConnection();
            List<T> list = qr.query(conn, sql, new BeanListHandler<T>(clazz), params);
            return list;

        } catch (SQLException throwables) {
            // 将编译异常转化为运行异常抛出
            throw new RuntimeException(throwables);
        } finally {
            JDBCUtilsByDruid.close(null, null, conn);
        }

    }

    /**
     * 查询单行结果
     * @param sql   sql 语句，可以有？
     * @param clazz 传入一个Class对象，比如Actor.class
     * @param params 可变形参？， 可以传入多个具体的？值
     * @return 根据Actor.class 返回对应的Actor对象
     */
    public T querySingle (String sql, Class<T> clazz, Object... params) {

        Connection conn = null;
        try {
            conn = JDBCUtilsByDruid.getConnection();
            T obj = qr.query(conn, sql, new BeanHandler<T>(clazz), params);
            return obj;

        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        } finally {
            JDBCUtilsByDruid.close(null, null, conn);
        }
    }


    /**
     * 返回单行单列的方法，即返回单值的方法
     * @param sql
     * @param params
     * @return
     */
    public Object queryScalar (String sql, Object... params) {
        Connection conn = null;

        try {
            conn = JDBCUtilsByDruid.getConnection();
            Object query = qr.query(conn, sql, new ScalarHandler(), params);
            return query;

        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);

        } finally {
            JDBCUtilsByDruid.close(null, null, conn);
        }

    }
}
