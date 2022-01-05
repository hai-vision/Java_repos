package com.hai.polymorphic.polyarr;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "\t薪水 = " + salary;
    }

    // Teacher类特有的方法
    public void teach() {
        System.out.println(getName() + "正在上课！");
    }
}
