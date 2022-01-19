package com.hai.reflect.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 */
@SuppressWarnings({"all"})
public class ReflectionAccessMethod {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.hai.reflect.reflection.User");
        User user = (User) cls.newInstance();

        // 访问public修饰的无参方法
        Method getName = cls.getMethod("getName");
        Object invoke = getName.invoke(user);
        System.out.println((String)invoke);

        // 访问public修饰的有参方法
        Method setName = cls.getMethod("setName", String.class);
        setName.invoke(user, "messi");
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.get(user));


        // 访问私有方法
        Method say1 = cls.getDeclaredMethod("say");
        // 暴破
        say1.setAccessible(true);
        say1.invoke(user);


    }
}
