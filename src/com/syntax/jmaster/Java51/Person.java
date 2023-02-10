package com.syntax.jmaster.Java51;

public class Person {
    private String Ho;
    private String ten;

    public String getHo() {
        return Ho;
    }

    public void setHo(String ho) {
        Ho = ho;
    }

    public String getTen() {
        return ten;
    }

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
