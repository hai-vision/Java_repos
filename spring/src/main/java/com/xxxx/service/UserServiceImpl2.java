package com.xxxx.service;

import com.xxxx.dao.UserDAO;

/**
 * @author hai
 * @date 2022/2/1
 * version 1.0
 */
@SuppressWarnings({"all"})
public class UserServiceImpl2 implements UserService2{


    @Override
    public void addUser() {
        System.out.println("add user");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user");

    }

    @Override
    public void updateUser() {
        System.out.println("update user");

    }

    @Override
    public void alterUser() {
        System.out.println("alter user");

    }




}
