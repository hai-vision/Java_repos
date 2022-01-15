package com.hai.iostream.exercise;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Reader_ file_reader = new File_Reader();
        Reader_ string_reader = new String_Reader();

        // 创建Buffered_Reader对象
        Buffered_Reader buffered_reader = new Buffered_Reader(file_reader);
        buffered_reader.readfile();
    }
}
