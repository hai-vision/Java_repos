package com.hai.homework.exercise01;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Frock {
    private static int currentNum = 100000;     // 初始序列号
    private int serialNumber;   // 序列号

    // 构造器
    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum() {
        // 生成上衣唯一序列号
        // 没调用一次，currentNum的值增加100;
        currentNum += 100;
        return currentNum;

    }

    public int getSerialNumber() {

        return serialNumber;
    }


}
