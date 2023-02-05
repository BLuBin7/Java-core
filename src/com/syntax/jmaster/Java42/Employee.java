package com.syntax.jmaster.Java42;

public class Employee extends Person{
    String ten;
    public void Thongtin()
    {
        this.ten = "B";
        System.out.println("thong tin class con la : " + this.ten );
//      gọi hàm Thongtin trong class cha
        super.Thongtin();
    }
}
