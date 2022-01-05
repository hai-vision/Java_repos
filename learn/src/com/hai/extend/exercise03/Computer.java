package com.hai.extend.exercise03;

/*
    父类
 */
public class Computer {
    // 属性
    private String CPU;
    private String memory;
    private String hardDisk;

    public Computer(String CPU, String memory, String hardDisk) {
        this.CPU = CPU;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    // 返回Computer类的信息

    public String getDetail(){
        return "CPU型号：" + CPU + " 内存：" + memory + " 硬盘：" + hardDisk;
    }


}
