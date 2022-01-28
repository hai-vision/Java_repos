package com.xxxx.dao;

import com.xxxx.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author hai
 * @date 2022/1/26
 * version 1.0
 */
@SuppressWarnings({"all"})
public interface UserDAO {
    User queryUserById (Integer id);
    User queryUserByIdAndPassword(@Param("id") Integer id, @Param("password") String password);
    User queryUserByIdAndPassword1(Map map);
    User queryUserByIdAndPassword2(User user);
    List<User> queryUsersByLike(@Param("username") String username);
}
