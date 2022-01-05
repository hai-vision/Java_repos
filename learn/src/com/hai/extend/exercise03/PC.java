package com.hai.extend.exercise03;
/*
    子类
 */
public class PC extends Computer{
    // 属性
    private String brand;    // 品牌

    public PC(String CPU, String memory, String hardDisk, String brand){
        // 调用父类有参构造器
        super(CPU, memory, hardDisk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 打印PC类信息
    public void printInfo(){
//        System.out.println(super.getDetail());
        System.out.println("CPU型号：" + getCPU() + " 内存：" + getMemory() + " 硬盘：" +
                getHardDisk() + " 品牌：" + brand);
    }
}
