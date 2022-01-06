package com.hai.exercise.demo1;

public class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("姓名：" + getName() + "\t年龄：" + getAge() +
                "\t职称：" + getPost() + "\t基本工资：" + getSalary() + (getSalary() * 1.3));
    }
}
