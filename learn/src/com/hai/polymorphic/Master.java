package com.hai.polymorphic;
/*
    主人类
    通过feed()方法，完成对动物的喂食
 */
public class Master {
    private String name;

    // 构造器
    public Master(String name) {
        this.name = name;
    }

    public String feed(Animal animal, Food food){
        return name + "正在给" + animal.getName()
                + "喂" + food.getFoodName();
    }
}
