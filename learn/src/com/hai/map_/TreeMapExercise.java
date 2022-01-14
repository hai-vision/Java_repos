package com.hai.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */

@SuppressWarnings({"all"})
public class TreeMapExercise {
    public static void main(String[] args) {
        // 传入一个比较器对象
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 向下转型为String类型
                Object key;
                String str1 = (String) o1;
                String str2 = (String) o2;
                // 比较key的大小
                //return str1.compareTo(str2);

                // 比较长度
                return str1.length() - str2.length();
            }
        });

        treeMap.put("name", "ball");
        treeMap.put("age", 31);
        // 由于比较的规则的key的长度，等添加的元素长度相同时
        // key无法添加至treeMap中，但是value会替换原先的value值
        treeMap.put("job", "player");

        System.out.println(treeMap);

    }
}
