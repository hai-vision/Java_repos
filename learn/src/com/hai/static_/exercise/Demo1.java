package com.hai.static_.exercise;

public class Demo1 {
    static int count = 9;
    public void test() {
        System.out.println("count = " + (count++));
    }

    public static void main(String[] args) {
        new Demo1().test(); // 匿名对象
        new Demo1().test();
        System.out.println("count = " + count);
    }
}
