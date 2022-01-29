package com.xxxx;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import com.xxxx.dao.UserDAO;
import com.xxxx.domain.User;
import com.xxxx.utils.MybatisUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hai
 * @date 2022/1/29
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestUser {

    @Test
    public void testUser () {
        User user1 = new User();
        //user1.setId(1);
        user1.setUsername("hai");
        UserDAO mapper = MybatisUtils.getMapper(UserDAO.class);
        User user2  = mapper.queryUser(user1);

        System.out.println(user2);


    }


    @Test
    public void testUser2 () {
        UserDAO mapper = MybatisUtils.getMapper(UserDAO.class);
        User user = new User();
        //user.setId(1);
        user.setGender(true);
        List<User> users = mapper.queryUser1(user);
        for (User user1 : users) {
            System.out.println(user1);
        }

    }


    @Test
    public void testUser3 () {
        UserDAO mapper = MybatisUtils.getMapper(UserDAO.class);
        //User user = new User(2, "yang", "1222", false, null);

        User user = new User();
        user.setId(2);
        user.setUsername("yang");
        mapper.updateUser(user);
        MybatisUtils.commit();
    }

    @Test
    public void testUser4 () {
        UserDAO mapper = MybatisUtils.getMapper(UserDAO.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        mapper.deleteBatchUser(arrayList);
        MybatisUtils.commit();
        //System.out.println(arrayList);

    }

    @Test
    public void testUser5 () {
        UserDAO mapper = MybatisUtils.getMapper(UserDAO.class);
        ArrayList<User> arrayList = new ArrayList();
        arrayList.add(new User(null, "hai", "111", true, new Date()));
        arrayList.add(new User(null, "messi", "111", true, new Date()));

        mapper.insertBatchUser(arrayList);
        MybatisUtils.commit();

    }

    @Test
    public void testUser6 (){
        UserDAO mapper = MybatisUtils.getMapper(UserDAO.class);
        PageHelper.startPage(2, 2);

        List<User> users = mapper.queryAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
