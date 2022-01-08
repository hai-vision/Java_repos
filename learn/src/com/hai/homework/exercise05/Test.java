package com.hai.homework.exercise05;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Test {
    public static void main(String[] args) {
        Car car = new Car(42);
        car.getAirInstance().flow();
        car = new Car(-1);
        car.getAirInstance().flow();
        car = new Car(22);
        car.getAirInstance().flow();
    }
}
