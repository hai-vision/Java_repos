package com.hai.genericity.exercise2;

import java.util.*;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */

// 泛型类
public class DAO<T> {
    private Map<String , T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);

    }

    // 从map中获得id对应的对象
    public T get(String id) {
        return map.get(id);
    }

    public void update (String id, T entity) {
        map.put(id, entity);
    }


    public void delete(String id) {
        map.remove(id);
    }

    // 返回map中素有存放的T对象
    /*
        分析
        1. cell values()，得到map中所有的values
        2. 将得到的values添加到List的实现子类中
     */
    public List<T> list() {
        Collection<T> values = map.values();
        List<T> tmp = new ArrayList();
        for (T o : values) {
            tmp.add(o);
        }

        return tmp;

    }
}
