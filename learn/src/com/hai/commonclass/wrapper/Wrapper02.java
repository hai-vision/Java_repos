package com.hai.commonclass.wrapper;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class Wrapper02 {
    public static void main(String[] args) {

        // 包装类与String的转化
        Integer integer = new Integer(45);
        String str = integer.toString();
//        String str1 = integer + "";
//        System.out.println(str + str1);

        // String 转化为包装类
        String str3 = "123";
        Integer integer1 = Integer.parseInt(str3); // 使用到了自动装箱

        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2);
    }
}
