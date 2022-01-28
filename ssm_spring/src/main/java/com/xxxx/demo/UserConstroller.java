package com.xxxx.demo;

import com.xxxx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hai
 * @date 2022/1/26
 * version 1.0
 */
@SuppressWarnings({"all"})
public class UserConstroller {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
