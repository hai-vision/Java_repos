package com.hai.homework.exercise02;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();

        Animal dog = new Dog();
        dog.shout();

        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        if(animal instanceof Cat){
            // 向下转型
            ((Cat)animal).shout();
        }else if(animal instanceof Dog){
            ((Dog)animal).shout();
        }
    }
}
