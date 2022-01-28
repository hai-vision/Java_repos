package com.xxxx;



import com.xxxx.dao.UserDAO;
import com.xxxx.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Unit test for simple App.
 */
public class TestMybatis
{
    public static void main(String[] args) throws IOException {
        // 1. 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        // 2. 构造SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3. 通过SqlSessionFactory 创建SQLSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4. 通过SQLSession获得DAO实现类的对象
        UserDAO mapper = sqlSession.getMapper(UserDAO.class);

        // 5. 测试查询方法
        //User user1 = mapper.queryUserById(1);
        //System.out.println(user1);
        //User user2 = mapper.queryUserByIdAndPassword(1, "123");
        //System.out.println(user2);

        //System.out.println("==================================");
        //Map map = new HashMap();
        //map.put("id", 1);
        //map.put("password", "123");
        //
        //User user3 = mapper.queryUserByIdAndPassword1(map);
        //System.out.println(user3);

        //User user = new User();
        //user.setId(1);
        //user.setPassword("123");
        //
        //User user4 = mapper.queryUserByIdAndPassword2(user);
        //System.out.println(user4);

        List<User> users = mapper.queryUsersByLike("hai");
        for (User user : users) {
            System.out.println(user);
        }


    }
}
