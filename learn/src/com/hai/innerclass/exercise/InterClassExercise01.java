package com.hai.innerclass.exercise;

public class InterClassExercise01 {
    public static void main(String[] args) {
        // 创建CellPhone实例
        CellPhone phone = new CellPhone();
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });




    }
}
