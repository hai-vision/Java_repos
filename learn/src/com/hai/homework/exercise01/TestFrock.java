package com.hai.homework.exercise01;

/**
 * @author 最佳损友
 * @version 1.0
 */

public class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());

        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());

        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());



    }
}
