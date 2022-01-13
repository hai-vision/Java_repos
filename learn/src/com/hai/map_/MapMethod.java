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
        map.put("爱好", "golf");

        // 得到所有的key集合
        Set keySet = map.keySet();
        // 1. use enhance for
        for(Object obj : keySet) {
            // thought call map.get()
            System.out.println(obj + ": " + map.get(obj));
        }

        // 2. use iterator
        // 因为Set是Collection的实现子类，继承了Collection的iterator方法
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + ": " + map.get(next));
        }

        // 3. 调用entrySet方法，获取EntrySet集合
        // 集合中的每一个元素是一个Entry
        // 调用Entry的getKey、getValue方法，获取相应的k-v
        Set set = map.entrySet();
        for (Object o : set) {
            // 向下转型，获取Entry对象
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 获取迭代器对象
        Iterator iterator1 = set.iterator();
        System.out.println("==================================");
        while(iterator1.hasNext()) {
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

        // 4. 获取所有的value
        Collection values = map.values();
        for(Object value :values ) {
            System.out.println(value);
        }





    }
}
