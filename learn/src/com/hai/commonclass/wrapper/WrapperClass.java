package com.hai.commonclass.wrapper;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class WrapperClass {
    public static void main(String[] args) {
        // 手动装箱
        int n1 = 10;
        Integer integer = new Integer(n1);
        // 或者
        Integer integer1 = Integer.valueOf(n1);

        // 拆箱
        int n2 = integer1.intValue();
        System.out.println(n2);

        // 自动装箱
        int n3 = 20;
        Integer integer2 = n3;  // 底层自动调用Integer.valueOf()方法

        // 自动拆箱
        int n4 = integer2;      // 底层自动调用intValue()方法

    }

    public static void byteWrapper(){
        byte n1 = 11;
        // 手动装箱
        Byte aByte = new Byte(n1);
        // 或者
        Byte aByte1 = Byte.valueOf(n1);

        // 拆箱
        byte n2 = aByte.byteValue();

    }
}
