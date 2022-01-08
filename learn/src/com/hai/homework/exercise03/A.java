package com.hai.homework.exercise03;


/**
 * @author 最佳损友
 * @version 1.0
 */


public class A {
    private String name = "neymar";
    // 在类中定义一个局部内部类B，B中有一个私有常量，有一个方法show打印常量
    public void innnerClass() {
        class Inner {
            private static final String name = "ball";

            public void show() {
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }

        Inner inner = new Inner();
        inner.show();
    }
}
