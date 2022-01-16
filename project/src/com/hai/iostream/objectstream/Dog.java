package com.hai.iostream.objectstream;

import java.io.Serializable;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
public class Dog implements Serializable {
    private String name = "小黑";
    private String color = "black";

    public Dog() {

    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
