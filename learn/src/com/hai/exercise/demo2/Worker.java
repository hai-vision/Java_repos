package com.hai.exercise.demo2;

public class Worker extends Employee{
    public Worker(String name, double dailyWage, int workDays) {
        super(name, dailyWage, workDays);
    }

    @Override
    public void showSalary() {
        System.out.println("工资为：" + getDailyWage()*getWorkDays());
    }
}
