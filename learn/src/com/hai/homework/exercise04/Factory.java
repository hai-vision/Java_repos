package com.hai.homework.exercise04;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Factory {
    public static Horse getHorse(){
        return new Horse();
    }

    public static Boat getBoat(){
        return new Boat();
    }
}
