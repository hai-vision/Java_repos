package com.hai.genericity;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
public class Person {
    private String name;
    private String hobby;

    public Person(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
