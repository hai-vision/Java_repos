package com.hai.polymorphic.apply;

public class Main {
    public static void main(String[] args) {
        // 利用向上转型，实例化对象
        Employee employee1 = new CommonEmployee("张三", 5000);
        Employee employee2 = new Manager("王二", 10000, 20000);

        // 实例化Test对象
        Test test = new Test();

        System.out.println(test.showEmployeeAnnual(employee1));
        System.out.println(test.showEmployeeAnnual(employee2));

        test.testWork(employee1);
        test.testWork(employee2);

        "hello".equals("abc");
        Integer integer = new Integer(100);


    }
}
