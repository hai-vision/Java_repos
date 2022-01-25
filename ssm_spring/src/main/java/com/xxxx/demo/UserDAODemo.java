package com.xxxx.demo;

import com.xxxx.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hai
 * @date 2022/1/25
 * version 1.0
 */
@SuppressWarnings({"all"})
public class UserDAODemo {
    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml" );
        UserDAO userDAO = (UserDAO) app.getBean("userDAO");
        userDAO.save();
    }
}
