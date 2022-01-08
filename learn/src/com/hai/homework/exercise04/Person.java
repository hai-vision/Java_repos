package com.hai.homework.exercise04;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Person {
    private String name;
    Vehicles vehicles;

    public Person(String name, Vehicles vehicles){
        this.name = name;
        this.vehicles = vehicles;
    }

    // 过河
    public void passRiver() {
        // 如果传入当前对象为空或者是Horse的实例，则创建一个船对象
        if(!(vehicles instanceof Boat)){
            vehicles = Factory.getBoat();
        }
        System.out.println(name + "此时站在河边"
                + vehicles.work());;
    }

    // 一般情况骑马
    public void common(){
        if(!(vehicles instanceof Horse)){
            // 不是Horse实例，则创建
            vehicles = Factory.getHorse();
        }
        System.out.println("一般情况下" + name + vehicles.work());
    }
}
