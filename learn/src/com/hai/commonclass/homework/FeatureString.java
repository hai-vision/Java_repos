package com.hai.commonclass.homework;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class FeatureString {
    public static void main(String[] args) {
        String str1 = "name";
        String str2 = "age";

        /*
            str3 的执行过程
            1. 先创建一个 StringBuilder sbnew StringBuilder()对象
            2. 执行 sb.append("name");
            3. sb.append("age");
            4. String str3 = sb.toString();
            其实最后是 c 指向堆中的对象 (String) value[] -> 常量池中的 ”nameage“
         */
        String str3 = str1 + str2;

        // 执行过程
        // 1. 先将字符串常量相加放在常量池中
        // 2. 再让str1指向常量池
        String str4 = "name" + "age";

        String str5 = "nameage";

        System.out.println(str4 == str5); // T
        System.out.println(str3 == str5); // false


        String s1 = "long";
        String s2 = "jian";
        String s3 = "longjian";
        String s4 = (s1 + s2).intern();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }
}
