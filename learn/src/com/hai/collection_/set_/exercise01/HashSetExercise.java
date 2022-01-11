package com.hai.collection_.set_.exercise01;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author hai
 * @date 2022/1/11
 * version 1.0
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Employee ball = new Employee("ball", 31);
        Employee messi = new Employee("messi", 33);
        Employee ball2 = new Employee("ball", 31);
        set.add(ball);
        set.add(messi);
        set.add(ball2);
        System.out.println(set);

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
