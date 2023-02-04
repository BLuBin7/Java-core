package com.exercise.exercise_1.Ex2;

public class Book {
//    Attribute
    private String name ;
    private Author author;
    private double price ;
    private int qlyInStock =0 ;
// Constructor
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qlyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qlyInStock = qlyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQlyInStock() {
        return qlyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQlyInStock(int qlyInStock) {
        this.qlyInStock = qlyInStock;
    }


}
