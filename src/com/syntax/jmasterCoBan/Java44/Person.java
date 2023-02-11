package com.syntax.jmasterCoBan.Java44;

/**
 * The type Person.
 */
public class Person {
    private  String ten;
    private Diachi diachi; // HAS - A : mỗi 1 person có 1 địa chỉ


    /**
     * Instantiates a new Person.
     *
     * @param ten the ten
     */
    public Person(String ten)
    {
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

    /**
     * Gets diachi.
     *
     * @return the diachi
     */
    public Diachi getDiachi() {
        return diachi;
    }

    /**
     * Sets diachi.
     *
     * @param diachi the diachi
     */
    public void setDiachi(Diachi diachi) {
        this.diachi = diachi;
    }
}
