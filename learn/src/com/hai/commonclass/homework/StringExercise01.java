package com.hai.commonclass.homework;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class StringExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "long";
        Person p2 = new Person();
        p2.name = "long";

        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        System.out.println(p1.name == "long");

        String s2 = new String("abc");
        String s1 = new String("abc");
        System.out.println(s1 == s2);

        String str1 = "name";
        System.out.println(str1.hashCode());
        str1 = "shan";
        System.out.println(str1.hashCode());



    }
}

class Person {
    String name;
}
