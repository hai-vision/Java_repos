package com.hai.exception.throws_;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Throws01 {
    public static void main(String[] args) {
        B b = new B();
        b.f1();
    }
}

class A {
    public void f1() throws Exception{
        int num1 = 10;
        int num2 = 0;
        int res = num1 / num2;
    }
}

class B extends A {
    @Override
    public void f1() throws ArithmeticException {

    }

}
