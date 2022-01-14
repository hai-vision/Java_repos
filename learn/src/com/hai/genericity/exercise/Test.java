package com.hai.genericity.exercise;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */

@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        // 创建3的Mydate
        MyDate date1 = new MyDate(1998, 10, 12);
        MyDate date2 = new MyDate(1999, 4, 25);
        MyDate date3 = new MyDate(1996, 10, 12);

        // 创建3个Employee对象
        Employee e1 = new Employee("ball", 10000, date1);
        Employee e2 = new Employee("messi", 20000, date2);
        Employee e3 = new Employee("ball", 15000, date3);

        // 创建3个ArrayList对象
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        System.out.println(list);
        // 排序方式：调用 Arraylist的sort方法，传入 Comparator>对象[使用泛型]
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 类型判断
                if(!(o1 instanceof  Employee || o2 instanceof  Employee)){
                    return 0;
                }

                int i = o1.getName().compareTo(o2.getName());
                if(i != 0) { // 名字不相同
                    return i;
                }

                int yearMinus = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if(yearMinus != 0) {// 当出生的年份不同
                    return yearMinus;
                }

                int monthMinus = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if(monthMinus != 0) {
                    return monthMinus;
                }

                int dayMinus = o1.getBirthday().getDay() - o2.getBirthday().getDay();
                if(dayMinus != 0) {
                    return dayMinus;
                }

                return 0;
            }
        });

        System.out.println(list);


    }
}
