package com.hai.reflect;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Cat {
    public String name = "ball";
    public double age;

    public Cat () {
        System.out.println("Cat类的无参构造器");
    }

    public Cat (String name) {
        this.name = name;
    }
    public Cat (double age ) {
        this.age = age;
    }
    public void hi () {
        System.out.println("hello");
    }

    public void cry () {
        System.out.println("猫咪在叫！");
    }

}
