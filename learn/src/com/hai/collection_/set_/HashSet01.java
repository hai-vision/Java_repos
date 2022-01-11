package com.hai.collection_.set_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        // HaseSet 底层调用的是HashMap
        /*
            1. 默认初始化table表的长度为16
            2. 当table表的元素个数为12时，数组扩容为原来的二倍
               threshold：12（临界值）
               threshold = table表长 * 加载因子 （0.75）
            3. 当单条链表的长度等于8，并且table表长大于等于64，则将table树化：红黑树

         */
        HashSet set = new HashSet();
        for (int i = 1; i < 100; i++) {
            set.add(i);
        }
    }
}
