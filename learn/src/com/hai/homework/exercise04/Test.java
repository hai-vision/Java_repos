package com.hai.homework.exercise04;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Test {
    public static void main(String[] args) {
        Vehicles horse = new Horse();
        // 一般情况下，唐僧用horse作为交通工具
        Person tang = new Person("唐僧",horse);
        tang.common();
        tang.passRiver();
    }
}
