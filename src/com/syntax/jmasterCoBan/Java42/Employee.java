package com.syntax.jmasterCoBan.Java42;

/**
 * The type Employee.
 */
public class Employee extends Person{
    /**
     * The Ten.
     */
    String ten;
    public void Thongtin()
    {
        this.ten = "B";
        System.out.println("thong tin class con la : " + this.ten );
//      gọi hàm Thongtin trong class cha
        super.Thongtin();
    }
}
