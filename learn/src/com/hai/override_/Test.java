package com.hai.override_;
/*
    测试类
 */
public class Test {
    public static void main(String[] args) {

        // 实例化Person对象
        Person person = new Person("ball", 31);
        // 调用Person中的say()
        System.out.println(person.say());

        // 实例化Student对象
        Student student = new Student("neymar", 28, 110, 89);
        System.out.println(student.say());

    }
}
