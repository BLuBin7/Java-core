package com.exercise.exercise_1.Ex2;

/**
 * The type Book.
 */
public class Book {
//    Attribute
    private String name ;
    private Author author;
    private double price ;
    private int qlyInStock =0 ;

    /**
     * Instantiates a new Book.
     *
     * @param name   the name
     * @param author the author
     * @param price  the price
     */
// Constructor
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * Instantiates a new Book.
     *
     * @param name       the name
     * @param author     the author
     * @param price      the price
     * @param qlyInStock the qly in stock
     */
    public Book(String name, Author author, double price, int qlyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qlyInStock = qlyInStock;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets qly in stock.
     *
     * @return the qly in stock
     */
    public int getQlyInStock() {
        return qlyInStock;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets qly in stock.
     *
     * @param qlyInStock the qly in stock
     */
    public void setQlyInStock(int qlyInStock) {
        this.qlyInStock = qlyInStock;
    }


}
