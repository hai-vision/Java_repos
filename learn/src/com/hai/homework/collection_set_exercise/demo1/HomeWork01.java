package com.hai.homework.collection_set_exercise.demo1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */

@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) {
        // 实例化新闻对象
        News news1 = new News("新闻一：新冠确诊病例超干万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("新间二：男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        ArrayList list = new ArrayList();

        // 将新闻对象添加到list 集合中
        list.add(news1);
        list.add(news2);

        // list倒序
        Collections.reverse(list);

        for (Object o : list) {
            System.out.println(o);
        }


    }
}

class News {
    private String title;   // 新闻标题
    private String content; // 新闻内容

    public News(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if (!(title.length() > 15)) {
            return  title ;
        }

        return  this.title = title.substring(0, 15) + "..." ;
    }
}
