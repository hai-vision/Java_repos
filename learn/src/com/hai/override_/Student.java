package com.hai.override_;
/*
    子类
 */
public class Student extends Person{

    // Student类特有的属性和方法
    private int id;
    private double score;

    // 构造器
    public Student(String name, int age, int id, double score) {
        // 调用父类构造器，完成父类对象的初始化
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+" 学号：" + id + " 成绩：" + score;
    }
}
