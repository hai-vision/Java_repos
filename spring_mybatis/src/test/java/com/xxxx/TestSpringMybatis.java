package com.xxxx;

import com.xxxx.dao.UserDAO;
import com.xxxx.domain.User;
import com.xxxx.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author hai
 * @date 2022/2/2
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestSpringMybatis {

    @Test
    public void test1 () {
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) app.getBean("sqlSessionFactory");
        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 通过mapper
        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        User user = (User) mapper.queryUserById(3);
        System.out.println(user);
    }

    @Test
    public void test2 () {
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDAO userDAO = (UserDAO) app.getBean("userDAO");
        User user =(User) userDAO.queryUserById(3);
        System.out.println(user);

    }

    @Test
    public void test3 () {
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");

        UserService userService = (UserService) app.getBean("userService");
        User user = userService.queryUserById(3);
        System.out.println(user);
    }

    @Test
    public void test4 () {
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.deleteUser(3);


    }
}
