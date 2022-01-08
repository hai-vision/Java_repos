package com.hai.innerclass;

public class AnonymousInner01 {
    public static void main(String[] args) {
        // 实例化外部类
        Outer01 outer01 = new Outer01();
        outer01.method();

        Outer02 outer02 = new Outer02();
        outer02.method();

    }
}

class Outer01 { // 外部类
    public void method() {
        /*
        // 内部类
        class Inner01 {

                1. 在匿名内部类中实现接口IA中的cry方法
                    常规思路
                    1. 定义一个类，implements接口IA的方法
                    2. 创建对象，调用cry方法

            public void innerMethod() {

                AA aa = new AA();
                aa.cry();

            }

        }
        // 创建内部类对象，调用innerMethod方法
        Inner01 inter = new Inner01();
        inter.innerMethod();
       */

        /*
            匿名内部类的底层逻辑
            class Outer01$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("匿名内部类实现了IA接口");
                }
            }
         */
        // 匿名内部类
        IA aa = new IA() {
            @Override
            public void cry() {
                System.out.println("匿名内部类实现了IA接口");
            }
        };
        aa.cry();
    }
}

class Outer02 {
    public void method() {
//        // 局部内部类
//        class Inner02 {
//            public void innerMethod02() {
//                // 实例化BB对象，调用run方法
//                BB bb = new BB();
//                bb.run();
//            }
//        }
//
//        // 实例化Inner02对象，调用innerMethod02方法
//        Inner02 inner02 = new Inner02();
//        inner02.innerMethod02();

        // 匿名内部类
        new Animal(){
            @Override
            void run() {
                System.out.println("匿名内部类继承了Animal");
            }
        }.run();


    }
}

interface IA {
    void cry();
}

class Animal {
    void run() {
        System.out.println("running！");
    }
}

class AA implements IA {

    @Override
    public void cry() {
        System.out.println("AA 实现了接口IA");
    }
}

class BB extends Animal {
    @Override
    void run() {
        System.out.println("BB 继承了Animal");
    }
}


