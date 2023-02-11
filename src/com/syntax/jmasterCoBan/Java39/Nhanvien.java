package com.syntax.jmasterCoBan.Java39;

/**
 * The type Nhanvien.
 */
public class Nhanvien {
//    Attribute
    private String ten;
    private String diachi;
    private int tuoi;
//    Constructor

    /**
     * Instantiates a new Nhanvien.
     *
     * @param ten    the ten
     * @param diachi the diachi
     * @param tuoi   the tuoi
     */
    public Nhanvien(String ten, String diachi, int tuoi) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
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
    public String getDiachi() {
        return diachi;
    }

    /**
     * Sets diachi.
     *
     * @param diachi the diachi
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    /**
     * Gets tuoi.
     *
     * @return the tuoi
     */
    public int getTuoi() {
        return tuoi;
    }

    /**
     * Sets tuoi.
     *
     * @param tuoi the tuoi
     */
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
