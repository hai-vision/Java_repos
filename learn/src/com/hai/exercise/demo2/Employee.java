package com.hai.exercise.demo2;

public class Employee {
    private String name;
    private double dailyWage;   // 单日工资
    private int workDays;       // 工作天数

    public Employee(String name, double dailyWage, int workDays) {
        this.name = name;
        this.dailyWage = dailyWage;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public void showSalary(){
        System.out.println("工资为：" + dailyWage * workDays );
    }
}
