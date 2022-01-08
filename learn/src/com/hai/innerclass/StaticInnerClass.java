package com.hai.innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        // 外部其他类访问内部类的静态成员
        System.out.println(Outer04.Inner04.num1);
        // 外部其他类访问内部类的非静态成员
        Outer04.Inner04 inner04 = Outer04.getInnerInstance();
        inner04.accessOuter();

        Outer04.Inner04 inner041 = new Outer04.Inner04();


    }
}

class Outer04 {

    public String name;
    public static int age = 10;
    public static void say() {

    }

    // 静态内部类
    static class Inner04 {
        private int num = 20;
        public static int num1 = 30;
        // 可以直接访问外部类的static成员
        public void accessOuter() {
            System.out.println(age);
            say();
            // 不能直接访问外部类的非静态成员,需要通过创建外部类对象
            Outer04 outer04 = new Outer04();
            System.out.println(outer04.name);
        }
    }

    // 外部类的方法访问内部类的成员
    public void accessInner() {
        // 创建内部类对象
        Inner04 inner04 = new Inner04();
        System.out.println(inner04.num);
        inner04.accessOuter();
        System.out.println(Inner04.num1);

    }

    public static Inner04 getInnerInstance(){
        return new Inner04();
    }

}
