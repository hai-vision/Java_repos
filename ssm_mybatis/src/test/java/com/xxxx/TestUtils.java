package com.xxxx;

import com.xxxx.dao.StudentDAO;
import com.xxxx.domain.Student;
import com.xxxx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestUtils {
    public static void main(String[] args) {
        // 静态代码块在类加载时被调用
        // 类加载： 实例化对象（子类对象）、调用静态成员

        // 1. 得到Mapper
        StudentDAO mapper = MybatisUtils.getMapper(StudentDAO.class);
        // 2. 得到数据库中信息
        List<Student> students = mapper.queryStudents();
        for (Student student : students ) {
            System.out.println(student);
        }



    }
}
