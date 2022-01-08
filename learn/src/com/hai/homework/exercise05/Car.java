package com.hai.homework.exercise05;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Car {

    // 属性
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    // 内部类

    public class Air {

        public void flow() {
            if(temperature > 40){
                System.out.println("冷风");
            }else if (temperature < 0){
                System.out.println("暖风");
            }else{
                System.out.println("shutdown");
            }
        }
    }

    public Air getAirInstance() {
        return new Air();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
