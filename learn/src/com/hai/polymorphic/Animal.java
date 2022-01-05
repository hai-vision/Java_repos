package com.hai.polymorphic;
/*
    动物类 ： 父类
 */
public class Animal {
    // 属性
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("正在吃东西");
    }
}
