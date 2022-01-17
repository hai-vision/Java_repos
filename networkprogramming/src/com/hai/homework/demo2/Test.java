package com.hai.homework.demo2;

import java.io.File;

/**
 * @author hai
 * @date 2022/1/17
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        File file = new File("src\\无名.mp3");
        String name = file.getName();
        String[] split = name.split("\\.", 2);
        System.out.println(split[0]);

        String present = "src\\";
        String chile = "\\gaohash.mp3";
        System.out.println(present +chile);
    }
}
