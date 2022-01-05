package com.hai.polymorphic.apply;

public class Test {
    public double showEmployeeAnnual(Employee employee) {
        return employee.getAnnual();
    }

    public void testWork(Employee employee){
        if(employee instanceof CommonEmployee){ // 如果是普通员工
            ((CommonEmployee) employee).work();
        }else if(employee instanceof Manager){
            ((Manager)employee).manage();
        }else{
            System.out.println("对象输入错误");
        }
    }
}
