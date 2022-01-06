package com.hai.exercise.demo3;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Teacher("张飞",'男', 30,5);
        persons[1] = new Student("小明", '男', 15, "00023102");

        Test test = new Test();

        test.testMathod(persons[0]);
        test.testMathod(persons[1]);


    }
}
