package com.hai.reflect.class_;

import com.hai.reflect.Car;

import java.lang.reflect.Field;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 * Class类常用的方法
 */
@SuppressWarnings({"all"})
public class Class02 {
    public static void main(String[] args) throws Exception{
        String classfullPath = "com.hai.reflect.Car";
        // 获取Car类对象的Class对象
        Class cls = Class.forName(classfullPath);

        // 获取包名
        System.out.println(cls.getPackage());
        // 获取类名
        System.out.println(cls.getName());
        // 生成对象实例
        Car car = (Car)cls.newInstance();
        System.out.println(car);
        // 通过反射获取属性, 但是不能直接获取私有属性
        Field field = cls.getField("brand");
        System.out.println(field.get(car));
        System.out.println(field.getName());
        // 通过反射给属性赋值
        field.set(car, "Audi");
        System.out.println(field.get(car));

        // 得到所有的属性
        Field[] fields = cls.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].get(car));
        }


    }
}
