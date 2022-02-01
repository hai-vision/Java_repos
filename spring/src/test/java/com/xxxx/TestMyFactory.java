package com.xxxx;

import static org.junit.Assert.assertTrue;

import com.xxxx.dao.UserDAO;
import com.xxxx.factory.MyFactory;
import org.junit.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class TestMyFactory {

    @Test
    public void test1 () throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        MyFactory myFactory = new MyFactory("/bean.properties");
        Object bean = myFactory.getBean("userDAO");

        UserDAO userDAO = (UserDAO) bean;
        userDAO.say();

    }

}
