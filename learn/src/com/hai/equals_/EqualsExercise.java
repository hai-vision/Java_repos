package com.hai.equals_;
/*
    重写equals方法，用于判断两个Person对象的内容是否相等
    如果两个Person对象的各个属性值都一样，则返回true，反之返回false
 */
public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("ball", 31, '男');
        Person person2 = new Person("ball", 31, '男');

        System.out.println(person1.equals(person2));
    }
}

class Person {

    private String name;
    private int age;
    private char gender;

    // 构造器
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        // 如果两个对象为同一个对象，则直接返回true
        if(this == obj){
            return true;
        }
        // 如果 obj 是否为Person类型或者其子类型
        if(obj instanceof Person){
            // 向下转型，得到obj各个属性
            Person person = (Person)obj;
            // 将转型后得到的person对象与当前对象的属性值进行比较
            return this.name.equals(person.name) && this.age == person.age &&
                    this.gender == person.gender;
        }

        return false;
    }
}
