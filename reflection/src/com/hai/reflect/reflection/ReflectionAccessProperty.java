package com.hai.reflect.reflection;

import java.lang.reflect.Field;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 */
@SuppressWarnings({"all"})
public class ReflectionAccessProperty {
    public static void main(String[] args) throws Exception{
        // 创建Class类对象
        Class<?> cls = Class.forName("com.hai.reflect.reflection.User");
        // 创建对象实例
        User user = (User)cls.newInstance();
        // 访问public修饰的特定属性
        Field name = cls.getField("userId");
        System.out.println(name.get(user));
        // 访问所有属性
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
        // 访问私有属性
        Field field = cls.getDeclaredField("name");
        System.out.println(field.getName());
        field.setAccessible(true);  // 暴破
        // 获取私有属性的值和给属性赋值时，进行暴破
        System.out.println(field.get(user));
        // 对属性进行赋值
        field.set(user, "messi");
        System.out.println(field.get(user));
        // 对静态属性进行赋值时，对象可以为空

        Field price = cls.getDeclaredField("price");
        price.setAccessible(true);
        price.set(null, 22.55);
        System.out.println(price.get(user));


    }
}
