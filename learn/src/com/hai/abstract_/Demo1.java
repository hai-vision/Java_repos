package com.hai.abstract_;

public class Demo1 {
    public static void main(String[] args) {
        A.say();

    }
}

abstract class A{
    public int n1;
    public static String name;
    public static int n2;

    public static void say() {
        System.out.println("hello");
    }

}
