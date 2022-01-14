package com.hai.map_;

import java.util.Properties;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
public class PropertiesMethod {
    public static void main(String[] args) {
        Properties pro= new Properties();

        // 添加
        pro.put("john", 100);
        // Properties 继承Hashtable, 因为键-值不能为空
        pro.put("lucy", 100);
        // 当添加的对象 key 相同时，新添加的元素会替换原先的元素
        pro.put("john", 80);
        pro.put("lic", 80);

        System.out.println(pro);
        // 删除
        pro.remove("john");

        // 修改
        pro.put("lucy", 90);
        System.out.println(pro);

        // 查找
        System.out.println(pro.get("lic"));
        System.out.println(pro.get("lic"));

    }
}
