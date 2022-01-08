package com.hai.extend.exercise;

public class Main {
    public static void main(String[] args) {
        AA bb = new BB();


    }
}

class AA {
    public int x;

}

class BB extends AA {
    public void Px() {
        System.out.println(x);
    }
}