package com.hai.encap;

// 封装的示例
public class Encap01 {

    // 属性
    public String name;
    private int age;
    private double salary;      // 工资

    public void setName(String name){
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else{
            this.name = "王二";
        }


    }

    public void setAge(int age){
        if(age >= 1 && age <= 120){
            this.age = age;
        }else{
            this.age = 22;
        }
    }

    public void setSalary(double salary){
        this.salary = salary;
    }


    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getSalary(){
        return this.salary;
    }
}
