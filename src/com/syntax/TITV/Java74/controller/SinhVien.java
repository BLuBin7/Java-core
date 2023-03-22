package com.syntax.TITV.Java74.controller;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Binh
 * Date : 3/4/2023 - 8:33 AM
 * Description :
 */
public class SinhVien implements  Comparable<SinhVien>, Serializable {
    private String mssv;
    private String hovaten;
    private double namsinh;
    private float dtb;

//    Constuctor rỗng để làm câu 6 ( nhập mssv )
    public SinhVien(String mssv) {
        this.mssv = mssv;
    }

//

    public SinhVien(String mssv, String hovaten, double namsinh, float dtb) {
        this.mssv = mssv;
        this.hovaten = hovaten;
        this.namsinh = namsinh;
        this.dtb = dtb;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public double getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(double namsinh) {
        this.namsinh = namsinh;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }


    @Override
    public String toString() {
        return "SinhVien{" +
                "mssv='" + mssv + '\'' +
                ", hovaten='" + hovaten + '\'' +
                ", namsinh=" + namsinh +
                ", dtb=" + dtb +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.mssv.compareTo(o.mssv);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(getClass() != o.getClass()) return false;
        SinhVien other = (SinhVien) o;
        return Objects.equals(this.mssv, other.mssv) ;
    }

}
