package com.hai.polymorphic.exercise;

public class PolyExercise {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count); // 20
        s.display();    // 20

        // 向上转型实例化对象
        Base b = s;
        System.out.println(b == s); // true
        System.out.println(b.count); // 10
        b.display();    // 20

    }
}

class Base {
    int count = 10;

    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base {

    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}