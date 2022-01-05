package com.hai.polymorphic.polyarr;

public class PolyArr {
    public static void main(String[] args) {
        // 创建一个多态数组
        Person[] person = new Person[5];

        person[0] = new Person("ball", 31);
        // 向上转型
        person[1] = new Student("tylor", 21, 82);
        person[2] = new Student("jack", 22, 50);

        person[3] = new Teacher("messi", 33, 100000);
        person[4] = new Teacher("neymar", 28, 100005);

        for (int i = 0; i < person.length; i++) {
            if(person[i] instanceof Student) {
                System.out.println(person[i].say());
                ((Student) person[i]).study();
            }else if(person[i] instanceof Teacher){
                System.out.println(person[i].say());
                ((Teacher)person[i]).teach();
            }else{
                System.out.println(person[i].say());
            }
        }


    }
}
