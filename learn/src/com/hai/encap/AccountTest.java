package com.hai.encap;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account();
//        account.setBalance(18);
//        account.setName("zuijisun");
//        account.setPassword("000");

        account.setName("唐三");
        account.setBalance(100000);
        account.setPassword("072915");

        account.info();
    }
}
