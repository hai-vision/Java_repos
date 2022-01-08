package com.hai.innerclass.exercise;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer03 outer = new Outer03();

        Outer03.Inner inner = new Outer03().getInnerInstance();
        inner.f2();
        System.out.println(inner.age);



    }
}

class Outer03 {// 外部类
    private String name = "zhangsan";

    public void f1() {
        System.out.println("外部类的方法f1()");
    }

    // 成员内部类
    class Inner {
        public int age;
        public void f2(){
            f1();
            System.out.println("成员内部类的方法f2" + name);
        }

    }
    // 成员内部类的访问
    public void callInner(){
        Inner inner = new Inner();
        inner.f2();
    }

    public Inner getInnerInstance(){
        return new Inner();
    }
}
