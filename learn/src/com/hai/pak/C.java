package com.hai.pak;

import com.hai.modifier.A;

public class C {

    // 在pak包下访问modifier包下A类的属性
    // 只能访问A类中public 修饰的属性或方法
    // 不能访问 protected、默认、private修饰的属性或方法
    A a = new A();
    public void fun(){
        System.out.println(a.name);
    }
}
