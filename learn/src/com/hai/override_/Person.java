package com.hai.override_;
/*
   父类
 */
public class Person {
    // 属性
    private String name;
    private int age;

    // 构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Person类的方法

    public String say() {
        return "个人介绍：" +
                "姓名： " + name + " 年龄：" + age;
    }
}
