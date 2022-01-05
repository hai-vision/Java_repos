package com.hai.polymorphic.polyarr;

public class Student extends Person {
    private double score;
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + "\t成绩 = " + score;
    }

    public void study() {
        System.out.println(getName() + "正在学习！");
    }
}
