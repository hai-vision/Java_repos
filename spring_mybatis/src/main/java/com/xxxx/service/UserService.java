package com.xxxx.service;

import com.xxxx.domain.User;

/**
 * @author hai
 * @date 2022/2/2
 * version 1.0
 */
@SuppressWarnings({"all"})
public interface UserService {
    User queryUserById (Integer id);

    int deleteUser (Integer id);
    int addUser (User user);
    int updateUser (User user);
}
