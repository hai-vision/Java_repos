package com.hai.extend.exercise03;

public class Test {
    public static void main(String[] args) {

        // 实例化对象
        PC pc = new PC("intel i5", "8GB", "1T", "ASUS");
        NotePad notePad = new NotePad("android", "12GB", "256GB", "white");

        pc.printInfo();
        notePad.printInfo();


    }
}
