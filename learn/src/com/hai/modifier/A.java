package com.hai.modifier;

public class A {

    // 四种属性，使用四种不同类型的访问修饰符
    public String name;
    protected int age;
    String gender;
    private String addr;

    // 在同一类中可以使用四种不同类型的访问修饰符的属性
    public void useAttribute(){
        System.out.println();
    }
}
