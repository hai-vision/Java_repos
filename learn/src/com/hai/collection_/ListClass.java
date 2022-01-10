package com.hai.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class ListClass {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(123);    // 包含自动装箱的过程 new Integer(123)
        list.add("jack");
        list.add(false);
        System.out.println(list);

        list.remove(false);
        System.out.println(list);
        // 判断元素是否存在
        System.out.println(list.contains("jack"));

        // 获取元素个数
        System.out.println(list.size());
        // 判断是否为空
        System.out.println(list.isEmpty());
        // 清空
        list.clear();

        List list1 = new ArrayList();
        list1.add("eason");
        list1.add("ball");
        list1.add("messi");

        list.add(list1);
        System.out.println(list);
        System.out.println(list.contains(list1));
        list.removeAll(list);
        System.out.println(list);
        System.out.println(list1);

    }
}
