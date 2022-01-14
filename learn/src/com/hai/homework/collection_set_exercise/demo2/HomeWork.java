package com.hai.homework.collection_set_exercise.demo2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */

@SuppressWarnings({"all"})
public class HomeWork {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Car bmw = new Car("BMW", 400000);
        Car phaeton = new Car("Phaeton", 1000000);

        list.add(bmw);
        list.add(phaeton);


        // 获取迭代器对象
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }


        list.remove(bmw);
        System.out.println("删除后=========================");
        for (Object obj : list) {
            System.out.println(obj);
        }


    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}