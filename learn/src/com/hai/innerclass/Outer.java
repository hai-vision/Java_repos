package com.hai.innerclass;

public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    public void m1() {
        System.out.println("Outer 的m1方法");
    }

    public void m2() {
        // 局部内部类
        String name = "Lily";
        class Inner {
            // 内部类的方法
            // 内部类可以访问外部类的私有属性
            public void innerSay() {
                System.out.println("内部类的name = " + name);
                // Outer.this的本质外部类的对象
                // 即哪个调用 m2方法Outer.this就是那个对象
                System.out.println("外部类的name = " + Outer.this.name);
                m1();
            }
        }

        Inner inner = new Inner();
        inner.innerSay();


    }


}
