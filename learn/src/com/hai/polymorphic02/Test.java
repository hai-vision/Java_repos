package com.hai.polymorphic02;

public class Test {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.num);
        System.out.println(base.result());

        // 向下转型
        Sub sub = (Sub)base;
        System.out.println(sub.num);
    }
}

class Base {

    public int num = 10;

    public int result() {
        return num;
    }

}

class Sub extends Base{
    public int num = 20;

    @Override
    public int result() {
        return num;
    }
}
