package com.hai.homework.exercise06;

/**
 * @author 最佳损友
 * @version 1.0
 */


public enum Color implements DefineColor{

    // 枚举常量
    RED(255,0,0), BLUE(0,0,255),
    BLACK(0,0,0), YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    // 构造器私有化

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    // getter方法

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值：" + redValue + "\t" + greenValue +"\t" + blueValue);
    }
}
