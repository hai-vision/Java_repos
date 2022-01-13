package com.hai.map_;

import java.util.HashMap;

/**
 * @author hai
 * @date 2022/1/13
 * version 1.0
 */
public class HashMapSource {
    public static void main(String[] args) {
        // HashMap 底层代码执行过程，同HashSet一致，详情请见HashSetSource

        // HashMap树化流程
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A (i), i);
        }

        /*
            树化的条件
            1. 单条链表的长度大于8
            2. table表长等于64
         */






    }
}

class A {
    private int num;

    public A (int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
