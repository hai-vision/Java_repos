package com.hai.polymorphic;
/*
    鱼类：子类
 */
public class Fish extends Food{

    public Fish(String foodName){
        // 调用父类构造方法，完成父类对象的初始化
        super(foodName);
    }
}
