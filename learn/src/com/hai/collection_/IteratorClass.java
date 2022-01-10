package com.hai.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class IteratorClass {
    public static void main(String[] args) {

        // 创建一个集合对象
        Collection list = new ArrayList();
        /*
            List list = new ArrayList();
         */

        // 添加集合元素
        list.add(new Book("西游记", "吴承恩", 85.5));
        list.add(new Book("三国演义", "罗贯中", 100.5));
        list.add(new Book("红楼梦", "曹雪芹", 95.9));


        // 获取一个迭代对象
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {

            Object next =  iterator.next();

            System.out.println(next.toString());

        }

        // 当退出while循环时，迭代器对象iterator指向最后一个元素
        // 如果想要重新遍历迭代器，则需要重置迭代器对象
        iterator = list.iterator();
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
