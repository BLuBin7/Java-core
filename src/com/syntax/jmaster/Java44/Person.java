package com.syntax.jmaster.Java44;

public class Person {
    private  String ten;
    private Diachi diachi; // HAS - A : mỗi 1 person có 1 địa chỉ


    public Person(String ten)
    {
        this.ten = ten;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Diachi getDiachi() {
        return diachi;
    }

    public void setDiachi(Diachi diachi) {
        this.diachi = diachi;
    }
}
