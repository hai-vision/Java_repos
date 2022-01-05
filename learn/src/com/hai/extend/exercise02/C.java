package com.hai.extend.exercise02;

public class C extends B{

    public C(){
        this("Hello");
        System.out.println("我是C类的无参构造");
    }

    public C(String name){
        super("hahah");
        System.out.println("我是C类的有参构造");
    }

}
