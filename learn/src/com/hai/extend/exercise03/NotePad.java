package com.hai.extend.exercise03;

public class NotePad extends Computer{

    // 属性
    private String color;

    public NotePad(String CPU, String memory, String hardDisk, String color) {
        super(CPU, memory, hardDisk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.println("CPU型号：" + getCPU() + " 内存：" + getMemory() + " 硬盘：" +
                getHardDisk() + " 颜色：" + color);
    }
}
