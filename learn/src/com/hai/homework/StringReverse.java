package com.hai.homework;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class StringReverse {
    public static void main(String[] args) {

        String str = "abcdef";
        str = reverse(str, 2, 5);
        System.out.println(str);

    }

    /*
        @ start：开始位序
        @ end ：结束位序
     */
    public static String reverse(String str, int start, int end){
        // 将String转成字符数组
        char[] chars = str.toCharArray();
        int startIndex = start - 1; // 开始索引
        int endIndex = end - 1;     // 结束索引
        char ch;        // 临时字符变量，用于交换
        while(startIndex <= endIndex ) {
            ch = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = ch;
            startIndex++;
            endIndex--;
        }

        // 将字符数组转成String返回
        return str = new String(chars);

    }
}
