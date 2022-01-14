package com.hai.genericity;

import java.util.ArrayList;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
@SuppressWarnings({"all"})
public class CustomGenericity {
    public static void main(String[] args) {
        // 自定义泛型
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("ball", "golf"));
        list.add(new Person("messi", "footbal"));

        for (Person person : list) {
            System.out.println(person.getName() + "爱好：" + person.getHobby());
        }


    }
}


