package com.hai.collection_.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        // 创建LinkedList对象
        LinkedList list = new LinkedList();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }

        // 删除
        // remove() 默认删除第一个元素
        list.remove();
        System.out.println(list);
        // 删除索引为 1
        list.remove(1);
        System.out.println(list);
        for (int i = 2; i < 10; i++) {
            list.add(i);
        }
        list.add("ball");
        System.out.println(list);
        boolean is = list.remove("ball");
        System.out.println(is);
        System.out.println(list);

        list.set(2, "ball");
        System.out.println(list);

        Object obj = list.get(2);
        System.out.println(obj);

        // 调用方法，获取迭代器对象
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

        // 增强for
        System.out.println("增强for----------------------------");
        for(Object o:list) {
            System.out.println(o);
        }

    }




}
