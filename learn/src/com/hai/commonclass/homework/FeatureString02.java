package com.hai.commonclass.homework;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class FeatureString02 {
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};

    public void change(String str, char[] ch) {
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        FeatureString02 fs = new FeatureString02();
        fs.change(fs.str, fs.ch);
        System.out.println(fs.str + "and");
        System.out.println(fs.ch);
    }
}
