package com.hai.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class EnhanceFor {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        // 添加集合元素
        list.add(new Book("西游记", "吴承恩", 85.5));
        list.add(new Book("三国演义", "罗贯中", 100.5));
        list.add(new Book("红楼梦", "曹雪芹", 95.9));

        for(Object book:list){
            System.out.println(book);
        }


    }
}

class Book1 {
    private String name;
    private String author;
    private double price;

    public Book1(String name, String author, double price) {
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

