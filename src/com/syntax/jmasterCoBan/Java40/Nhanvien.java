package com.syntax.jmasterCoBan.Java40;

/**
 * The type Nhanvien.
 */
public class Nhanvien extends Person{
    /**
     * The Luong.
     */
    double luong;

    /**
     * Instantiates a new Nhanvien.
     *
     * @param ten    the ten
     * @param diachi the diachi
     */
    public Nhanvien(String ten, String diachi) {
        super(ten, diachi);

    }

    /**
     * Mucluong.
     */
    public void mucluong()
    {
        System.out.println("luong");
    }
}
