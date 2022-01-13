package com.hai.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author hai
 * @date 2022/1/13
 * version 1.0
 */
public class MapExercise01 {
    public static void main(String[] args) {
        // 利用HashMap添加三个员工对象
        HashMap map = new HashMap();

        // 创建三个员工对象
        Employees employee1 = new Employees("ball", 15000, 101);
        Employees employee2 = new Employees("messi", 20000, 102);
        Employees employee3 = new Employees("naymer", 20500, 103);

        map.put(101, employee1);
        map.put(102, employee2);
        map.put(103, employee3);

        // use entrySet()
        Set set = map.entrySet();
        for (Object obj : set) {
            // 向下转型成Entry
            Map.Entry entry = (Map.Entry)obj;
            Employees e = (Employees) entry.getValue();
            if(e.getSalary() > 18000 ) {
                System.out.println(e);
            }
        }

        // use keySet
        Set set1 = map.keySet();
        // 调用iterator
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            // 通过key得到相应的value
            Object o = map.get(key);
            // 向下转型
            Employees e = (Employees) o;
            if(e.getSalary() > 18000) {
                System.out.println(o);
            }

        }


    }
}

class Employees {
    private String name;
    private double salary;
    private int id;

    public Employees(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "姓名：" + name + "\t"
                + "工资：" + salary + "\t"
                + "员工id：" + id ;
    }
}
