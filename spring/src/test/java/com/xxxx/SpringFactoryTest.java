package com.xxxx;

import com.xxxx.dao.UserDAO;
import com.xxxx.domain.User;
import com.xxxx.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hai
 * @date 2022/2/1
 * version 1.0
 */
@SuppressWarnings({"all"})
public class SpringFactoryTest {

    @Test
    public void testSpring () {
        // 1. 启动工厂
        ApplicationContext app = new ClassPathXmlApplicationContext("/spring-context.xml");
        UserDAO userDAO = (UserDAO) app.getBean("userDAO");
        userDAO.say();

        UserService userService = (UserService) app.getBean("userService");
        userService.hello();
    }

    @Test
    public void test2 () {
        ApplicationContext app = new ClassPathXmlApplicationContext("/spring-context.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.hello();

    }

    @Test
    public void test3 () {
        ApplicationContext app = new ClassPathXmlApplicationContext("/spring-context.xml");
        User user = (User) app.getBean("user");

        System.out.println(user);
    }
}
