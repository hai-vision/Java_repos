package com.hai.exercise.demo2;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Worker("jack", 150, 30);
        Employee e2 = new Manager("marry", 300, 30);

        e1.showSalary();
        e2.showSalary();
    }
}
