package com.syntax.jmasterCoBan.Java47;

/**
 * The type Employee.
 */
public class Employee extends Person{
    private double luong;

    /**
     * Gets luong.
     *
     * @return the luong
     */
    public double getLuong() {
        return luong;
    }

    /**
     * Sets luong.
     *
     * @param luong the luong
     */
    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public void Thongtin() {
        System.out.println("class con");
    }
}
