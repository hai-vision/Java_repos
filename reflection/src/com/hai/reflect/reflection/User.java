package com.hai.reflect.reflection;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 */
@SuppressWarnings({"all"})
public class User {
    public String userId = "001";
    private String name = "ball";
    private int age = 31;
    private static double price;

    public User () {

    }

    public User (String name) {
        this.name = name;
    }

    private User (int age) {
        this.age = age;
    }

    public User(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void say () {
        System.out.println("hello");
    }
}
