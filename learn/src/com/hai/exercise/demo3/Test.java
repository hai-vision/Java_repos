package com.hai.exercise.demo3;

public class Test {
    public void testMathod(Person p) {
        if(p instanceof Student){
            System.out.println(p.toString());
            // 向下转型
            ((Student)p).study();
            System.out.println(p.play());
        }else if(p instanceof Teacher){
            System.out.println(p.toString());
            ((Teacher)p).teach();
            System.out.println(p.play());
        }else{
            System.out.println("传入的参数有误！");
        }
    }
}
