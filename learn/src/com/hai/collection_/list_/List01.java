package com.hai.collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class List01 {

    public static void main(String[] args) {
        /* 1. List集合类中各元素有序（添加顺序和取出顺序一致，并且元素可以重复）
           2. List集合中的每个元素都有其对应的索引

        */

        // 创建ArrayList对象
        List list = new ArrayList();
        // 增加
        list.add("ball");
        list.add("messi");
        list.add("neymar");

        List list2 = new ArrayList();
        list2.add("cris");
        list2.add("tylor");

        list.addAll(1, list2);
        System.out.println(list);


        list.remove("tylor");
        System.out.println(list);

        Object o = list.get(2);
        System.out.println(o);

        list.set(1, "mary");
        System.out.println(list);

    }
}
