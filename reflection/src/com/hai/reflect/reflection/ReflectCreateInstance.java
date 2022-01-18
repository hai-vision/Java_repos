package com.hai.reflect.reflection;

import java.lang.reflect.Constructor;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 * 通过反射创建对象
 */
@SuppressWarnings({"all"})
public class ReflectCreateInstance {
    public static void main(String[] args) throws Exception {

        // 1. 获取User类的Class类对象
        Class cls = Class.forName("com.hai.reflect.reflection.User");
        // 2. 通过无参构造器创建实例
        Object o = cls.newInstance();
        System.out.println(o);

        // 3. 通过有参构造器创建实例
        //    步骤：通过getConstructor得到相应的构造器，在通过newInstance传入对应的实参
        Constructor constructor = cls.getConstructor(String.class);
        Object o1 = constructor.newInstance("ball");
        System.out.println(((User)o1).getName());

        // 4. 通过是由的构造器创建对象
        Constructor constructor1 = cls.getDeclaredConstructor(int.class);
        // 创建实例【反射面前一切都是纸老虎】
        constructor1.setAccessible(true);   // 暴破，使用反射可以访问private构造器
        User user1 = (User)constructor1.newInstance(22);
        System.out.println(user1.getAge());




    }
}
