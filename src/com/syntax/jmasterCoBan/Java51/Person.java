package com.syntax.jmasterCoBan.Java51;

/**
 * The type Person.
 */
public class Person {
    private String Ho;
    private String ten;

    /**
     * Gets ho.
     *
     * @return the ho
     */
    public String getHo() {
        return Ho;
    }

    /**
     * Sets ho.
     *
     * @param ho the ho
     */
    public void setHo(String ho) {
        Ho = ho;
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

    @Override
    public String toString() {
        return "Person{" +
                "Ho='" + Ho + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
