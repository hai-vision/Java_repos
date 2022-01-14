package com.hai.genericity.exercise2;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
public class Test {
    public static void main(String[] args) {
        DAO<String> dao = new DAO<String>();

        dao.update("001", "ball");
        dao.update("002", "messi");
        dao.update("003", "neymar");
        dao.update("004", "cris");

        List<String> list = dao.list();
        System.out.println(list);

        //dao.delete("001");
        //System.out.println(dao.list());

        dao.update("001", "mary");
        System.out.println(dao.list());






    }
}
