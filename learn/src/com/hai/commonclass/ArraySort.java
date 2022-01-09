package com.hai.commonclass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class ArraySort {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("水浒传", 85);
        books[1] = new Book("三国演义", 75.5);
        books[2] = new Book("java从入门到放弃", 300);

//        sortByPrice(books);
        sortByBookNameLength(books);
        System.out.println(Arrays.toString(books));

    }

    public static void sortByPrice(Book[] books){
        // 根据价格排序
        Arrays.sort(books, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                // o1 o2: 是Book对象
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;

                double priceVal = book1.getPrice() - book2.getPrice();
                if(priceVal > 0){
                    return -1;
                }else if(priceVal < 0){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
    }

    public static void sortByBookNameLength(Book[] books){
        Arrays.sort(books, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                // o1 o2: 是Book对象
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;

                return book2.getBookName().length() - book1.getBookName().length();
            }
        });
    }

}

class Book {
    private String bookName;
    private double price;

    public Book(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
