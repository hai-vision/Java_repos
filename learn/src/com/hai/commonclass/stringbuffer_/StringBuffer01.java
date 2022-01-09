package com.hai.commonclass.stringbuffer_;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        // 分配一个容量为 16 的value的字符数组
        StringBuffer stringBuffer = new StringBuffer();
        // 通过构造器，指定char数组的容量
        StringBuffer stringBuffer1 = new StringBuffer(100);
        // 给定一个String的str，构造StringBuffer构造器，char[]数组的容量为：str.length+16
        StringBuffer hello = new StringBuffer("hello");

        // String --> StringBuffer
        String s1 = "张三";
        // 通过构造器，将String转换为StringBuffer
        StringBuffer stringBuffer2 = new StringBuffer(s1);

        // 货真通过StringBuffer的append方式
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3 = stringBuffer3.append(s1);

        // 将StringBuffer --> String
        StringBuffer stringBuffer4 = new StringBuffer("hello");
        String s2 = stringBuffer4.toString();
        System.out.println(s2);

        // 利用String类的构造器
        String s = new String(stringBuffer4);
        System.out.println(s);
    }
}
