package com.hai.abstract_.exercise;

public class Mul extends Template {
    @Override
    public void job() {
        // 计算乘
        int sum = 1;
        for (int i = 1; i <= 100000; i++) {
            sum *= i;
        }
    }
}
