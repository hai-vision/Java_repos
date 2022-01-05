package com.hai.extend.exercise;

public class B extends A{
    public B(){
        this("abc");
        System.out.println("b");

    }

    public B(String name){
        // 默认调用父类的无参构造器
        System.out.println("b name");
    }
}
