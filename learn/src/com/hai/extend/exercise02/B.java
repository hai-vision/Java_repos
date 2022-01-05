package com.hai.extend.exercise02;

public class B extends A{

    // B类的无参构造
    public B(){
        System.out.println("我是B类的无参构造");
    }

    public B(String name){
        // 默认调用父类的无参构造
        System.out.println(name + "我是B类的有参构造");
    }
}
