package com.hai.enumerate;

/**
 * @author 最佳损友
 * @version 1.0
 */


public enum Season01 {

    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");

    private String name;
    private String desc;

    Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
        System.out.println(name + desc);
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
