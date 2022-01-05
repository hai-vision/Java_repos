package com.hai.polymorphic.dynamic_;
/*
    java的动态绑定机制
 */
public class DynamicBinDing {
    public static void main(String[] args) {

        // 向上转型
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {// 父类
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }


}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    @Override
    public int getI() {
        return i;
    }

//    @Override
//    public int sum1() {
//        return i + 10;
//    }
}
