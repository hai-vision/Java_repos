package com.xxxx.domain;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Subject {

    private Integer id;
    private String name;
    private Integer grade;

    // 关联属性
    private List<Student1> student1;

    public Subject() {
    }

    public Subject(Integer id, String name, Integer grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public List<Student1> getStudent1() {
        return student1;
    }

    public void setStudent1(List<Student1> student1) {
        this.student1 = student1;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", student1=" + student1 +
                '}';
    }
}
