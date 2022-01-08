package com.hai.static_.exercise;

public class Person {
    private int id;
    private static int total = 0;
    public static int getTotalPerson() {
//        id++;
        return total;
    }

    public Person() {
        total++;
        id = total;
    }
}



