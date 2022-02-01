package com.xxxx.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/2/1
 * version 1.0
 */
@SuppressWarnings({"all"})
public class MyFactory {

    private Properties properties = new Properties();

    public MyFactory () {}

    public MyFactory (String config) throws IOException {
        // 加载配置文件
        InputStream resourceAsStream = MyFactory.class.getResourceAsStream(config);
        properties.load(resourceAsStream);

    }

    public Object getBean(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 通过classPath，获取对应的类路径
        String property = properties.getProperty(classPath);
        //反射构建对象
        Class cls = Class.forName(property);
        return cls.newInstance();
    }

}
