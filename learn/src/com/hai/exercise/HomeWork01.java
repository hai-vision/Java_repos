package com.hai.exercise;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 实例化一个Person对象数组
        Person[] persons = new Person[3];
        for (int i = 0; i < persons.length; i++) {
            System.out.println("请输入第" + (i+1) + "个人的信息" );
            System.out.print("姓名：");
            String name = input.next();

            System.out.print("年龄：");
            int age = input.nextInt();

            System.out.print("工作：");
            String job = input.next();

            persons[i] = new Person(name, age, job);
        }

        sortOfAge(persons);
        print(persons);
    }

    public static void sortOfAge(Person[] persons){
        Person p = null;
        for (int i = 0; i < persons.length-1; i++) {
            for (int j = 0; j < persons.length - i -1; j++) {
                if(persons[j].getAge() > persons[j+1].getAge()){
                    p = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = p;
                }
            }
        }
    }

    public static void print(Person[] persons){
        for (int i = 0; i < persons.length; i++) {
            System.out.println("姓名：" + persons[i].getName() +
                    "\t年龄：" + persons[i].getAge() +
                    "\t工作："+ persons[i].getJob());

        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
