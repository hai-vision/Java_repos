package com.hai.collection_.set_.exercise02;

import java.util.HashSet;

/**
 * @author hai
 * @date 2022/1/11
 * version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        //new Employee("ball")
        MyDate myDate1 = new MyDate(1998, 7, 2);
        MyDate myDate2 = new MyDate(1999, 7, 2);
        MyDate myDate3 = new MyDate(1998, 7, 2);

        Employee ball = new Employee("ball", 20000, myDate1);
        Employee messi = new Employee("messi", 20000, myDate2);
        Employee ball1 = new Employee("ball", 20000, myDate3);

        set.add(ball);
        set.add(messi);
        set.add(ball1);

        System.out.println(set);



    }
}
