package com.xxxx.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 * 1. 加载配置文件
 * 2. 创建SqlSessionFactory
 * 3. 创建SqlSession
 * 4. 事务管理
 * 5. Mapper获取
 */
@SuppressWarnings({"all"})
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final ThreadLocal<SqlSession> t1 = new ThreadLocal();
    // 由于配置文件只需要加载一次，因此将其放在静态代码块中
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            // 构建SqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        } catch (IOException e) {
            // 将编译异常转换为运行异常抛出
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取 SqlSession
     * @return
     */
    public static SqlSession openSqlSession () {
        SqlSession sqlSession = t1.get();
        if ( sqlSession == null){
            sqlSession=sqlSessionFactory.openSession();
            t1.set(sqlSession);
        }
        return sqlSession;
    }

    public static void closeSession () {
        SqlSession sqlSession = t1.get();
        sqlSession.close();
    }


    public static void commit () {
        SqlSession sqlSession = openSqlSession();
        sqlSession.commit();
        closeSession();
    }

    public static void rollback () {
        SqlSession sqlSession = openSqlSession();
        sqlSession.rollback();
        closeSession();
    }

    public static <T> T getMapper (Class<T> cls) {
        SqlSession sqlSession = openSqlSession();
        return sqlSession.getMapper(cls);
    }




}
