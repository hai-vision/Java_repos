package com.hai.exception.throws_;

import java.io.FileNotFoundException;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class Throws02 {
    public static void main(String[] args) {


    }
    public static void f1() {
        /*
            1. 调用含有编译异常，调用者必须处理编译异常或者继续抛出异常
            2. 当调用者不处理编译异常，则编译器会提示错误
         */
//        f3();
    }

    public static void f2() {
        /*
            1. 调用运行时异常，当程序员不对异常进行处理，编译器会默认抛出和调用方法一致的异常类型
            2. 因此程序并不会报错
         */
        f4();

    }

    public static void f3() throws FileNotFoundException {
        // 抛出一个编译异常

    }

    public static void f4() throws NullPointerException{
        // 抛出运行时异常
    }
}
