package com.hai.polymorphic.apply;

public class Manager extends Employee {
    private double bonus;   // 奖金

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println(getName() + "对公司进行管理！");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
