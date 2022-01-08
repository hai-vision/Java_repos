package com.hai.enumerate;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Season {
    /*
        1. 构造器私有化
        2. 对外暴露对象实例

     */

    private String name;
    private String desc;

    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");


    // 构造器
    private Season(String name, String desc) {
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
