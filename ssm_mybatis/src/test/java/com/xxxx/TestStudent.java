package com.xxxx;

import com.xxxx.dao.StudentDAO;
import com.xxxx.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author hai
 * @date 2022/1/27
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestStudent {
    public static void main(String[] args) throws IOException {
        // 1. 加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        // 2. 构建SQLSessionFactory
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 3. 构建SqlSession
        SqlSession sqlSession = build.openSession();

        // 4. 构建StudentDAO实现类对象
        StudentDAO mapper = sqlSession.getMapper(StudentDAO.class);

        // 5. 测试方法
        // 插入数据
        //Student student = new Student();
        //student.setId(1);
        //student.setName("ball");
        //student.setGender("男");
        //int i = mapper.insertStudent(student);
        //
        //// 6. 提交事务
        //sqlSession.commit();
        //System.out.println(i > 0 ? "添加成功" : "添加失败");


        // 更新数据
        //int i = mapper.updateStudentOfName("neymar", 2);
        //// 提交事务
        //sqlSession.commit();
        //System.out.println(i > 0 ? "更改成功" : "添加失败");

        //int i = mapper.deleteStudentById(2);
        //// 提交事务
        //sqlSession.commit();
        //System.out.println(i > 0 ?

        Student student = mapper.queryStudentById(1);
        System.out.println(student);

        List<Student> students = mapper.queryStudents();
        for (Student student1 :students) {
            System.out.println(student1);
        }


    }


}
