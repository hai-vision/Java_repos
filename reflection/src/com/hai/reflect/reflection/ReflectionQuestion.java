package com.hai.reflect.reflection;

import com.hai.reflect.Cat;


import java.io.FileReader;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 */
@SuppressWarnings({"all"})
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        pro.load(new FileReader("src\\re.properties"));
        pro.list(System.out);
        String classfullpath = pro.getProperty("classfullpath");
        String methodName = pro.getProperty("method");


        // 用Properties来提取出类名是String类型，无法创建对象

        /*
            反射机制的妙用
            即通过外部文件配置，在不修改源码的情况下来控制程序（只需要修改配置文件对应的内容）

         */

        // 可以使用发射机制来创建对象，具体步骤
        // 1. 加载类
        Class cls = Class.forName(classfullpath);
        // 2. 通过 cls 得到加载的类 com.hai.reflect.Cat 的对象实例
        Object obj = cls.newInstance();
        // 3. 通过 cls 得到加载的类 com.hai.reflect.Cat 的方法对象
        //    在反射中，可以把方法是为对象（万物皆对象）
        Method method = cls.getMethod(methodName);
        // 4. 通过方法对象调用方法
        //    调用方法的传统方式： 对象名.方法名()
        //    反射机制： 方法对象.invoke(对象名)
        method.invoke(obj);

        // 获取字段
        // getField 不能得到私有属性
        Field field = cls.getField("name");
        System.out.println(field.get(obj));

        // 得到构造器getConstructor(), ()
        // 不带参数，则返回无参构造器
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);

        // 带参数
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);



    }
}
