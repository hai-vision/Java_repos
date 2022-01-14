package com.hai.genericity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
public class Generic02 {
    public static void main(String[] args) {
        // 创建三个学生对象
        Student mary = new Student("mary", 19);
        Student messi = new Student("messi", 22);
        Student ball = new Student("ball", 21);

        // 创建HashMap对象，并利用泛型规范输入为String , Student
        HashMap<String, Student> map = new HashMap<>();
        map.put("mary", mary );
        map.put("messi", messi);
        map.put("ball", ball);


        // 获取keySet
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " :" + map.get(key));
        }

        // 获取EntrySet
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> entry =  iterator.next();
            System.out.println(entry.getKey() + "= " + entry.getValue());

        }

    }
}
