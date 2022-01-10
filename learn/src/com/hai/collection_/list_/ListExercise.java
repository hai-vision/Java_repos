package com.hai.collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }

//        // 在第2号元素插入"hspedu"
//        list.add(2, "hspedu");
//        System.out.println(list);
//        // 获取第5个元素
//        Object o = list.get(4);
//        System.out.println(o);
//
//        // 删除第6个元素
//        Object o1 = list.get(5);
//        String s = (String)o1;
//        list.remove(s);
//
//        // 修改第7个元素
//        list.set(6, "eason");
//        System.out.println(list);
//
//        System.out.println("-------------------------------");
//        // 调用iterator方法，获取一个迭代器对象
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//            System.out.println(next);
//
//        }

        for (int i = 0; i < list.size(); i++) {
            Object o2 = list.get(i);
            System.out.println(o2);
        }




    }
}
