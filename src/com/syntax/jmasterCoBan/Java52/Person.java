package com.syntax.jmasterCoBan.Java52;
//lớp abstract không thể tạo 1 đối tượng mới nhờ nó
public abstract class Person {
    private String ten;

    public Person(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
