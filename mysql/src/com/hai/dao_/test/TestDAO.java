package com.hai.dao_.test;

import com.hai.dao_.dao.ActorDAO;
import com.hai.dao_.domain.Actor;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/25
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestDAO {

    @Test
    public void TestActorDAO () {
        ActorDAO actorDAO = new ActorDAO();
        // 查询多条记录
        String sql = "select * from actor where id > ?";
        List<Actor> actors = actorDAO.queryMulti(sql, Actor.class, 1);
        for (Actor actor: actors) {
            System.out.println(actor);
        }

        // 查询单条记录
        sql = "select * from actor where id = ?";
        Actor actor = actorDAO.querySingle(sql, Actor.class, 2);
        System.out.println(actor);

        // 查询单值
        sql = "select name from actor where id = ?";
        Object o = actorDAO.queryScalar(sql, 3);
        System.out.println(o);

        // 插入数据
        sql = "insert into actor values(?,?,?,?,?)";
        actorDAO.update(sql, 4, "liyu", "女", "1999-09-08", "1117");





    }
}
