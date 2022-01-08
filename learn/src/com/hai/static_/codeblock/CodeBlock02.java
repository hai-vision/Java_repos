package com.hai.static_.codeblock;

public class CodeBlock02 {
    public static void main(String[] args) {
        AA aa = new AA();

    }
}

class AA {

    // 静态属性
    public static int age = getAge();
    public int nums = getNums();
    // 静态代码块
    static {
        System.out.println("静态代码块被调用~");
    }

    // 普通代码块
    {
        System.out.println("普通代码块被调用~");
    }

    public static int getAge() {
        System.out.println("静态属性被调用~");
        return 10;
    }

    public int getNums() {
        System.out.println("普通属性被调用~");
        return 20;
    }

    // 构造器
    AA() {
        System.out.println("构造器被调用！");
    }

}
