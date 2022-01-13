package com.hai.collection_.set_.linkedhashset;

import java.util.LinkedHashSet;

/**
 * @author hai
 * @date 2022/1/13
 * version 1.0
 */

@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        String aa = new String("AA");
        set.add(aa);
        set.add("ball");
        set.add(new Customer("messi", 10));
        set.add(456);
        set.add(456);
        set.add("neymar");


        System.out.println(set);

        /*
            1. LinkedHashSet 元素的加入顺序和取出顺序一致
            2. LinkedHashSet 底层维护的是一个LinkedHashMap(HashMap的子类)
            3. LinkedHashSet 底层结构是：table数组 + 双向链表
            4. 添加第一个元素，直接将数组table扩容到 16，存放的结点类型是 LinkedHashMap$Entry
            5. 数组table的类型是HashMap$Node[], 存放的数据是 LinkedHashMap$Entry类型
               说明Entry实现了/继承了Node
               static class Entry<K,V> extends HashMap.Node<K,V> {
                    Entry<K,V> before, after;
                    Entry(int hash, K key, V value, Node<K,V> next) {
                        super(hash, key, value, next);
                    }
              }

         */

    }
}

class Customer {
    private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
