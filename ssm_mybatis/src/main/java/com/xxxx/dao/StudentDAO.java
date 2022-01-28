package com.xxxx.dao;

import com.xxxx.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/27
 * version 1.0
 */

public interface StudentDAO {

    int insertStudent (Student stu);
    int updateStudentOfName (@Param("name") String name, @Param("id") Integer id);
    int deleteStudentById(Integer id);
    Student queryStudentById (@Param("id") Integer id);
    List<Student> queryStudents ();

}
