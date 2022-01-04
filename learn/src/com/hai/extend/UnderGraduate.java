package com.hai.extend;

/*
    本科生类：子类
 */
public class UnderGraduate extends Student{

    // 本科生类特有的方法
    public UnderGraduate(){
        // 当父类的无参构造器不存在，必须使用super来完成父类的初始化
        super("jack", 85);
        System.out.println("子类的无参构造器被调用");
    }

}
