package com.xxxx;

import com.xxxx.dao.Student1DAO;
import com.xxxx.domain.Student1;
import com.xxxx.domain.Subject;
import com.xxxx.utils.MybatisUtils;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/29
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestStudent1 {
    public static void main(String[] args) {

        Student1DAO mapper = MybatisUtils.getMapper(Student1DAO.class);
        Student1 student1 = mapper.queryStudent1ById(1);
        System.out.println(student1);
        List<Subject> subjects = student1.getSubjects();

        for (Subject subject : subjects) {
            System.out.println(subject);
        }

    }
}
