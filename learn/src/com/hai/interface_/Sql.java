package com.hai.interface_;

public class Sql implements DBInterface{


    @Override
    public void connect() {
        System.out.println("sql 数据库已连接！");
    }

    @Override
    public void close() {
        System.out.println("sql 数据库已连接！");
    }

    public void testing(){
        System.out.println("sql特有的方法");
    }
}
