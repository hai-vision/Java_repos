package com.hai.exercise.demo3;

public class Teacher extends Person{
    private int workAge;

    public Teacher(String name, char gender, int age, int workAge) {
        super(name, gender, age);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    @Override
    public String toString() {
        return super.toString() + "\n工龄：" + workAge;
    }

    // Teacher 特有的方法
    public void teach(){
        System.out.println("我承诺，我会认真教学！");
    }
}
