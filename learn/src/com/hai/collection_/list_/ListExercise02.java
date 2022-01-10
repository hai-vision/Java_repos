package com.hai.collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("西游记", "吴承恩", 85.5));
        list.add(new Book("三国演义", "罗贯中", 100.5));
        list.add(new Book("红楼梦", "曹雪芹", 95.9));

        BubbleSort(list);
        System.out.println(list);
        for (Object o : list) {
            System.out.println(o);
        }

        formatOfPrint(list);


    }

    public static void BubbleSort(List list) {
//        Object tmp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i -1; j++) {
                Book book1 = (Book)(list.get(j));
                Book book2 = (Book)(list.get(j+1));
                if(book1.getPrice() > book2.getPrice() ) {
//                    tmp = list.get(j);
//                    list.set(j, list.get(j+1));
//                    list.set(j+1, tmp);

                    list.set(j, book2);
                    list.set(j+1, book1);

                }
            }
        }
    }

    public static void formatOfPrint(List list) {
        for (Object o : list) {
            System.out.println("名称：" + ((Book)o).getName()
                    + "\t\t" + "作者：" + ((Book)o).getAuthor()
                    + "\t\t" + "价格：" + ((Book)o).getPrice());
        }


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
        return "名称：" + name
                + "\t\t\t" + "价格：" + price
                + "\t\t\t" + "作者：" + author;
    }
}
