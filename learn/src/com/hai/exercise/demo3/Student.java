package com.hai.exercise.demo3;

public class Student extends Person {
    // 特有属性
    private String id;

    public Student(String name, char gender, int age, String id) {
        super(name, gender, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public String toString() {
        return super.toString() + "\n学号：" + id;
    }

    // Student类特有的方法
    public void study() {
        System.out.println("我承诺，我会好好学习！");
    }


}
