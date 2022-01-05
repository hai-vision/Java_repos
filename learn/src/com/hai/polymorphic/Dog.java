package com.hai.polymorphic;
/*
    狗类：子类
 */
public class Dog extends Animal {

    // Dog类特有的属性
    public String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;

    }

    public void run(){
        System.out.println("小狗正在奔跑");
    }

    @Override
    public void eat() {
        System.out.println("小狗正在吃东西");
    }
}
