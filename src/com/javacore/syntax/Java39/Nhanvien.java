package com.javacore.syntax.Java39;

public class Nhanvien {
//    Attribute
    private String ten;
    private String diachi;
    private int tuoi;
//    Constructor

    public Nhanvien(String ten, String diachi, int tuoi) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return  '{' + "ten= " + ten  +
                ", diachi=" + diachi  +
                ", tuoi=" + tuoi +
                '}';
    }
}
