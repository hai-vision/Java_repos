package com.xxxx.service.impl;

import com.xxxx.dao.UserDAO;
import com.xxxx.domain.User;
import com.xxxx.service.UserService;

/**
 * @author hai
 * @date 2022/2/2
 * version 1.0
 */
@SuppressWarnings({"all"})
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Override
    public User queryUserById(Integer id) {
        return userDAO.queryUserById(id);
    }

    @Override
    public int deleteUser(Integer id) {

        return userDAO.deleteUser(id);
    }

    @Override
    public int addUser(User user) {
        return userDAO.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userDAO.updateUser(user);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
