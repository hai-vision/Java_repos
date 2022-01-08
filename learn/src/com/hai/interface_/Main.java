package com.hai.interface_;

public class Main {
    public static void main(String[] args) {
        // 创建一个对象数组
        DBInterface[] db = new DBInterface[2];
        db[0] = new DBMysql();
        db[1] = new Sql();

        // 实例化Test对象
        Test test = new Test();
        test.test(db[0]);
        test.test(db[1]);
        test.t(db);

    }
}
