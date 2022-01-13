package com.hai.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author hai
 * @date 2022/1/13
 * version 1.0
 */
@SuppressWarnings({"all"})
public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();

        /*
            1. put的参数可以是任意引用类型
            2. 加入的顺序和取出元素的顺序不一致
            3. key可以为空，但只能出现一次
            4. 当加入重复的key, 后一个key会把前一个覆盖
            5. value可以相同，且value为空可以出现多次
            6. 常用String类型作为Map中的key
            7. key和value是单一的一对一的关系，通过key可以找到唯一对应的value
         */
        map.put("no1", "eason");
        map.put("no2", "张无忌");
        map.put("no3", "张三丰");
        map.put(null, null);
        map.put("no4", "张三丰");
        //System.out.println(map.get("no3"));

        Set set = map.entrySet();
        for(Object o : set) {
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey());
        }

        Set set1 = map.keySet();
        for (Object o : set1) {
            System.out.println(o);
        }

        Collection values = map.values();
        for (Object o :values) {
            System.out.println(o);
        }


        /*
            解读
            1. k-v 最后存放在HashMap$Node
               Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {
                    return new Node<>(hash, key, value, next);
               }
            2. 为了方便程序员遍历 k-v ，还会创建一个 EntrySet集合，该集合存放的元素的类型是 Entry
               一个Entry对象就有k、v, EntrySet<Entry<k, v>>

            3. EntrySet中，定义类型是 Map.Entry, 实现类型是HashMap$Node
               因为内部类Node 实现了 Map.Entry接口
               static class Node<K,V> implements Map.Entry<K,V>

               这与LinkedHashMap不同， LinkedHashMap定义类型是HashMap.Node
               实现类型是LinkedHashMap$Entry, 即Entry继承类Node

            4. 将HashMap对象存放到EntrySet中，方便程序员的遍历



         */

    }
}
