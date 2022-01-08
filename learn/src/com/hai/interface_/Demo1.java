package com.hai.interface_;

public class Demo1 {
}

interface AA {
    int x = 0;
}

class BB {
    int x = 1;
}

class CC extends BB implements AA {
    public void PX() {
        System.out.println(super.x);
        System.out.println(AA.x);
    }

    public static void main(String[] args) {
        //1. BB cc = new CC();
        new CC().PX();


    }
}
