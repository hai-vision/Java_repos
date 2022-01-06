package com.hai.exercise.demo3;

/*
    父类
 */
public class Person {
    // 属性
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return name + "爱玩";
    }

    @Override
    public String toString() {
        return "学生信息如下：\n"
                + "姓名：" + name
                + "\n年龄：" + age
                + "\n性别" + gender;

    }
}
