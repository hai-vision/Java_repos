package com.hai.exercise.demo2;

public class Manager extends Employee{
    public Manager(String name, double dailyWage, int workDays) {
        super(name, dailyWage, workDays);
    }

    @Override
    public void showSalary() {
        System.out.println("工资为：" + (1000 + getDailyWage() * getWorkDays() * 1.2));
    }
}
