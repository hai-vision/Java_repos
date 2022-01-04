package com.hai.modifier;

public class B {

    // 访问A类中的属性
    public void accessA(){
        A a = new A();
        // 不能访问A中private修饰的属性
        System.out.println(a.age + a.gender + a.name);
    }
}
