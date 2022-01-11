package com.hai.map_;

import java.util.*;

/**
 * @author hai
 * @date 2022/1/11
 * version 1.0
 */
public class MapMethod {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("姓名", "ball");
        map.put("职业", "player");
        map.put("年龄", 31);

        // 调用keySet(), 获取所有key
        Set set = map.keySet();

        // Set 的遍历方式有
        // 1. enhance for
        // 2. 迭代器
        for(Object key: set){
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("iterator way ------------------------------");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "=" + map.get(key));

        }

        // 获取所有的value
        Collection values = map.values();
        // Collection 的遍历方式有
        /*
            1. enhance for
            2. iterator
            3. 普通for循环
         */

        System.out.println("===================================");
        for(Object value: values){
            System.out.println(value);
        }

        System.out.println("===================================");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }

        for (int i = 0; i < values.size(); i++) {
            //System.out.println(values[i]);


        }


    }
}
