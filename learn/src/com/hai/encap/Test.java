package com.hai.encap;

public class Test {
    public static void main(String[] args) {
        Encap01 encap01 = new Encap01();

        encap01.setAge(18);
        encap01.setName("唐三");
        encap01.setSalary(10000.0);

        System.out.println(encap01.getAge() + encap01.getName() + encap01.getSalary());
    }
}
