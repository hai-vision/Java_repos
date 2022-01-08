package com.hai.abstract_;

public class Manager extends Employee {
    private double bonus;   // 奖金

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }


    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
