package com.hai.interface_;

public class DBMysql implements DBInterface{

    // 实现接口的抽象方法

    @Override
    public void connect() {
        System.out.println("mysql 数据库已连接！");
    }

    @Override
    public void close() {
        System.out.println("myslq 数据库已关闭");
    }

    public void work(){
        System.out.println("mysql特有的方法");
    }
}
