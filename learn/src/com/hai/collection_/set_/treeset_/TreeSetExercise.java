package com.hai.collection_.set_.treeset_;

import java.util.TreeSet;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TreeSetExercise {
    public static void main(String[] args) {

        // 使用TreeSeethe提供的一个构造器，可以传入一个比较器
        // 传入一个匿名内部类对象
        //TreeSet set = new TreeSet(new Comparator() {
        //    @Override
        //    public int compare(Object o1, Object o2) {
        //        // 将传入的对象向下转型为String
        //        // 根据字符长长度进行排序
        //        String str1 = (String)o1;
        //        String str2 = (String)o2;
        //        return str1.length()-str2.length();
        //    }
        //});
        //
        //set.add("ball");
        //set.add("messi");
        //set.add("aa");
        //set.add("abd");
        //System.out.println(set);
        //// 由于比较规则是判断字符串的长度是否相等，因此当新添加的字符串长度等于set中某一字符串长度，则不添加
        //set.add("asd");
        //
        //System.out.println(set);

        /*
            Comparator<? super K> cpr = comparator;
                if (cpr != null) {
                    do {
                        parent = t;
                        // 多态的动态绑定机制
                        // 调用传入对象的compare方法
                        cmp = cpr.compare(key, t.key);
                        if (cmp < 0)
                            t = t.left;
                        else if (cmp > 0)
                            t = t.right;
                        else
                            return t.setValue(value);
                    } while (t != null);
                }
         */

        TreeSet treeSet = new TreeSet();
        treeSet.add("ball");


    }
}


