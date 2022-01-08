package com.hai.abstract_;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new CommonEmployee("zhangsan", 111, 5000);
        Employee e2 = new Manager("lisi", 113, 7000, 10000);

        e1.work();
        e2.work();
    }
}
