package com.hai.interface_;

/*
    测试类
 */
public class Test {

    public void test(DBInterface dbInterfaces) {

        if (dbInterfaces instanceof DBMysql) {
            // 向下转型
            ((DBMysql) dbInterfaces).work();
        } else if (dbInterfaces instanceof Sql) {
            ((Sql) dbInterfaces).testing();
        }else{
            System.out.println("参数有误");
        }

    }

    public void t(DBInterface[] dbInterfaces){
        for (int i = 0; i < dbInterfaces.length; i++) {
            dbInterfaces[i].connect();
            dbInterfaces[i].close();
        }
    }

}
