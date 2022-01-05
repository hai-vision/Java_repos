package com.hai.polymorphic;

/*
    测试类
 */
public class Test {


    public static void main(String[] args) {

        // 实例化Master对象
        Master ball = new Master("ball");

//        // 实例化Cat类对象
//        Cat xiaohua = new Cat("小花");
//        // 实例化Dog
//        Dog dahuang = new Dog("大黄");
//
//        // 实例化Fish对象
//        Fish fish = new Fish("鲫鱼");
//        // 实例化Bone对象
//        Bone bone = new Bone("排骨");
//        // 实例化Rice对象
//        Rice r = new Rice("r");
//
//        System.out.println(ball.feed(xiaohua, fish));
//        System.out.println(ball.feed(dahuang, bone));

        // 实例化子类对象（向上转型）
        Animal animal = new Dog("大黄", "yellow");
        // 向上转型，不能访问子类特有的属性（或方法）
        // animal.color;
        animal.eat();

        Dog dog = (Dog)animal;




    }
}
