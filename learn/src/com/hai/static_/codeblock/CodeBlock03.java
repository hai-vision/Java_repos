package com.hai.static_.codeblock;

public class CodeBlock03 {
    public static void main(String[] args) {
        // 创建B类对象的过程
        /*
            1. 首先进行类加载
                1.1 先加载父类 A
                    1.1.1 调用父类 A的静态代码块和静态属性
                1.2 后加载子类 B
                    1.2.1 调用子类 B的静态代码块和静态属性

            2. 调用父类 A 的super()，即调用父类的无参构造器
                2.1 A类再调用器父类的无参构造（Object类）
                2.2 调用 A类的普通代码块
                2.3 执行A类的构造器，完成父类对象属性的初始化工作

            3. 回到子类B构造器中，调用子类普通代码块和普通属性
            4. 执行子类B的构造器，完成子类对象属性的初始化工作

         */
        new B();
    }
}

class A {
    // 静态属性
    public static int age1 = getAge1();
    // 普通属性
    public int count1 = getCount1();

    // 静态代码块
    static {
        System.out.println("A类的静态代码块被调用~");
    }
    // 普通代码块
    {
        System.out.println("A类的普通代码块被调用~");
    }

    public A() {
        // super()
        // 普通代码块
        System.out.println("A类的构造器被调用~");
    }

    public static int getAge1(){
        System.out.println("A类的静态属性被初始化~");
        return 10;
    }

    public int getCount1() {
        System.out.println("A类的普通属性被初始化~");
        return 20;
    }
}

class B extends A {
    // 静态属性
    public static int age2 = getAge2();
    // 普通属性
    public int count2 = getCount2();

    // 静态代码块
    static {
        System.out.println("B类的静态代码块被调用~");
    }
    // 普通代码块
    {
        System.out.println("B类的普通代码块被调用~");
    }

    public B() {
        // super()
        // 普通代码块
        System.out.println("B类的构造器被调用~");
    }

    public static int getAge2(){
        System.out.println("B类的静态属性被初始化~");
        return 10;
    }

    public int getCount2() {
        System.out.println("B类的普通属性被初始化~");
        return 20;
    }
}
