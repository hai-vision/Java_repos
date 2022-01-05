package com.hai.polymorphic.apply;

public class CommonEmployee extends Employee {

    public CommonEmployee(String name, double salary) {
        super(name, salary);
    }

    // 普通员工类特有的属性和方法
    public void work() {
        System.out.println(getName() + "正在工作！");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
