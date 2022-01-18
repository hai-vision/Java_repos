package com.hai.reflect.class_;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Class01 {
    public static void main(String[] args) throws Exception {
        // 1. Class类也是类，因此继承Object
        // 2. Class类对象不是 new 出来的，而是系统创建的
        // 3. 对于某个类的Class类对象，在内存中只有一份，因此类只加载一次
        Class cls1 = Class.forName("com.hai.reflect.Cat");
        Class cls2 = Class.forName("com.hai.reflect.Cat");

        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());

        // 4. 每个类的实例都会记得自己是由哪个Class实例所生成
        // 5. 通过Class类对象，可以得到



    }
}
