package com.hai.reflect.demo;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) throws IOException {


    }

    public void saveProperties () throws IOException{
        Properties pro = new Properties();
        pro.setProperty("classfullpath", "com.hspedu.Cat");
        pro.setProperty("method", "hi");
        pro.store(new FileWriter("src\\re.properties"), null);
    }

    @Test
    public void readProperties () throws IOException{
        Properties pro = new Properties();
        pro.load(new FileReader("src\\re.properties"));
        pro.list(System.out);
        System.out.println(pro.getProperty("method"));

        // 用Properties来提取出类名是String类型，无法创建对象

        // 可以使用发射机制来创建对象，具体步骤


    }
}
