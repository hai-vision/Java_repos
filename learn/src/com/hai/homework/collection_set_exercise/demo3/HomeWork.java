package com.hai.homework.collection_set_exercise.demo3;

import java.util.*;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
@SuppressWarnings({"all"})

public class HomeWork {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);

        // 将jack 的工资改为2600
        map.put("jack", 2600);

        // 遍历集合中所有的员工
        // 1. use entrySet
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey());

        }

        // 2. use enhance
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey());
        }

        // 获取所有的keySet
        Set set1 = map.keySet();
        for (Object obj :set1){
            System.out.println(obj);
        }

        // 获取所有的value
        Collection values = map.values();
        for (Object o : values) {
            System.out.println(o);
        }

        // 每个员工加薪100
        for (Object key : set1) {
            map.put(key, (Integer)map.get(key) + 100);
        }

        System.out.println(map);


    }
}
