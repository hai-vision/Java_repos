package com.xxxx.dao.imple;

import com.xxxx.dao.UserDAO;

/**
 * @author hai
 * @date 2022/1/25
 * version 1.0
 */
@SuppressWarnings({"all"})
public class UserDAOImple implements UserDAO {

    @Override
    public void save() {
        System.out.println("save running");
    }

    public UserDAOImple () {
        System.out.println("UserDAOImple 的无参构造器被调用");
    }

}
