package com.hai.collection_.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class CollectionExercise01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        List list = new ArrayList();
        // 添加元素
        list.add(new Dog("little black", 3));
        list.add(new Dog("little white", 2));

        for (Object o :list) {
            System.out.println(o.toString());
        }

        // 调用迭代器方法，创建一个迭代器对象
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());

        }


    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
