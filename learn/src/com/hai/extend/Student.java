package com.hai.extend;

/*
    学生类：父类
 */
public class Student {
    // 属性
    public String name;
    private double score;

//    public Student(){//无参构造器
//        System.out.println("父类的无参构造器被调用");
//    }

    public Student(String name, double score){
        System.out.println("父类的Student(String name, double score)被调用");
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 方法
    public void testing(){
        System.out.println(this.getName() + "正在考试");
    }

    public void showInfo(){
        System.out.println(this.name + "的成绩是：" + this.score);
    }
}
