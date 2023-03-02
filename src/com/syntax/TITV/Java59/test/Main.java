package com.syntax.TITV.Java59.test;

/**
 * Created by Binh
 * Date : 3/3/2023 - 7:17 PM
 * Description :
 */
public class Main {
    private Day thu;
    private String monhoc;

    public Main(Day thu, String monhoc) {
        this.thu = thu;
        this.monhoc = monhoc;
    }

    public Day getThu() {
        return thu;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

}
