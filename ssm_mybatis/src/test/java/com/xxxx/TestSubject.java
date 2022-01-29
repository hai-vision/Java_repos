package com.xxxx;

import com.xxxx.dao.StudentDAO;
import com.xxxx.dao.SubjectDAO;
import com.xxxx.domain.Student;
import com.xxxx.domain.Student1;
import com.xxxx.domain.Subject;
import com.xxxx.utils.MybatisUtils;
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
public class TestSubject {
    public static void main(String[] args) throws IOException {
        SubjectDAO mapper = MybatisUtils.getMapper(SubjectDAO.class);
        Subject subject = mapper.querySubjectById(1001);

        //System.out.println(subject);

        List<Student1> student1 = subject.getStudent1();
        for (Student1 student11 : student1) {
            System.out.println(student11) ;
        }


    }


}
