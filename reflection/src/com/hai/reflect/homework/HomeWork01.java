package com.hai.reflect.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author hai
 * @date 2022/1/19
 * version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) throws Exception {
        // 创建Class类对象
        Class<?> cls = Class.forName("com.hai.reflect.homework.PrivateTest");
        // 实例化对象
        PrivateTest obj = (PrivateTest)cls.newInstance();
        // 获取PrivateTest类的私有属性name
        Field name = cls.getDeclaredField("name");
        // 暴破
        name.setAccessible(true);
        // 更改属性值
        name.set(obj, "ball");

        // 获取PrivateTest 的公共方法 getName的Method对象
        Method getName = cls.getMethod("getName");
        Object invoke = getName.invoke(obj);

        System.out.println((String)invoke);


    }
}
