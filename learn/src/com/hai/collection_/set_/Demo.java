package com.hai.collection_.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        // 创建Set接口的实现子类HashSet的对象
        Set set = new HashSet();
        // set不能包含相同的元素，且set中只能出现一次null，即数据不能重复
        // set的取出顺序和添加顺序不一致
        // 当set中元素确定后，每一次取出的元素顺序都是一致的

        for (int i = 1; i < 4; i++) {
            set.add(i);
        }

        set.add("ball");
        set.add(null);

        set.add("ball");
        set.add(null);

        System.out.println(set);

        for (int i = 0; i < 3; i++) {
            System.out.println(set);
        }

        /*
            set 的遍历方式
            1. 由于Set继承了Collection接口，因此实现了iterator方法
               所以可以利用迭代器实现对set的遍历
            2. enhance for
         */

        // 调用iterator方法，创建迭代器对象
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        // enhance for
        for (Object o : set) {
            System.out.println(o);
        }


    }
}
