package com.hai.equals_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        People p1 = new People();
        p1.name = "Eason";

        People p2 = new People();
        p2.name = "Eason";

        System.out.println(p1 == p2); // false
        System.out.println(p1.name.equals(p2.name)); // true
        System.out.println(p1.equals(p2));  // false （没有重写equals方法，判断两个对象的地址是否相等）

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));  // true（重写了equals方法，判断内容是否相等）
        System.out.println(s1 == s2);   // false

        
    }
}

class People {
    public String name;
}
