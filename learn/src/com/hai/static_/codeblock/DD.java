package com.hai.static_.codeblock;

public class DD {

    public static int age = 10;

    static {
        System.out.println("静态代码块被调用！");
    }

    {
        System.out.println("普通代码开被调用~");
    }

    public static void say() {

    }

}
