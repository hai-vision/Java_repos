package com.xxxx.service.imple;

import com.xxxx.dao.UserDAO;
import com.xxxx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hai
 * @date 2022/1/26
 * version 1.0
 */
@SuppressWarnings({"all"})
public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        // 创建Spring容器，生成Bean对象
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) app.getBean("userDAO");
        userDAO.save();
    }
}
