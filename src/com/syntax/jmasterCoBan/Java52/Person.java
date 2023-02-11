package com.syntax.jmasterCoBan.Java52;

/**
 * The type Person.
 */
//lớp abstract không thể tạo 1 đối tượng mới nhờ nó
public abstract class Person {
    private String ten;

    /**
     * Instantiates a new Person.
     *
     * @param ten the ten
     */
    public Person(String ten) {
        this.ten = ten;
    }

    /**
     * Gets ten.
     *
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * Sets ten.
     *
     * @param ten the ten
     */
    public void setTen(String ten) {
        this.ten = ten;
    }
}
