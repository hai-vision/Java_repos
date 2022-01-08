package com.hai.enumerate.exercise;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class EnumExercise01 {
    public static void main(String[] args) {
        // 获取所有枚举对象
        Week[] weeks = Week.values();
        for(Week week:weeks){
            System.out.println(week.getName());
        }
    }
}
