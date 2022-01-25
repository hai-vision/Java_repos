package com.xxxx.test;

import com.xxxx.dao.UserDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hai
 * @date 2022/1/25
 * version 1.0
 */
@SuppressWarnings({"all"})
public class SpringTest {
    @Test
    /**
     * 测试scope属性
     * scope = sigleton: 单例（默认）
     */
    public void test1 () {
        /*
            1. 当 scope = singeton 时，在加载配置文件时，调用无参构造，创建Bean对象
         */
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) app.getBean("userDAO");
        userDAO.save();

        // 创建一个新对象，判断二者的地址是否相同
        UserDAO userDAO1 = (UserDAO) app.getBean("userDAO");
        System.out.println(userDAO1 == userDAO);


    }

    @Test
    /**
     * 测试scope属性
     * scope = prototype: 多例的
     */
    public void test2 () {
        /*
            1. 当 scope = prototype 时，在加载配置文件时
            2. 每执行一次getBean，就会创建一个Bean对象
         */
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) app.getBean("userDAO");
        UserDAO userDAO1 = (UserDAO) app.getBean("userDAO");

        System.out.println(userDAO1 == userDAO);
    }

}
