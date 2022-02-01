package com.xxxx.service;

import com.xxxx.dao.UserDAO;

/**
 * @author hai
 * @date 2022/2/1
 * version 1.0
 */
@SuppressWarnings({"all"})
public class UserServiceImpl implements UserService{

    // 定义UserDAO的接口
    private UserDAO userDAO;
    @Override
    public void hello() {
        userDAO.say();
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
