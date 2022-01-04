package com.hai.extend;

/*
    test class

    1. 在创建子类对象时，必须调用父类的无参构造器
    2. 当父类没有无参构造器时，必须在子类中使用super来指定对父类的哪一个构造器进行了初始化
 */
public class Main {
    public static void main(String[] args) {
//        UnderGraduate s = new UnderGraduate();
//        s.setName("tansan");
//        s.setScore(89);
//        s.testing();
//        s.showInfo();

        // 实例化子类对象
        UnderGraduate stu = new UnderGraduate();
    }
}
