package com.syntax.jmasterCoBan.Java56.DinhdangSo;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * The type Main.
 */
//Java Cơ Bản - Định dạng hiển thị Số trong Java
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        long l = 123456789;
        double k = 1234567.890123;

//        khai báo theo định dạng
//        vd khai báo theo định dạng việt nam
        Locale locale = new Locale("vi","VN");
        NumberFormat format = NumberFormat.getInstance();

//        format bao nhiêu kí tự sau dấu phẩy
        format.setMaximumFractionDigits(4);
        format.setMinimumFractionDigits(0);
//        format bao nhiêu kí tự trước dấu phẩy
        format.setMaximumIntegerDigits(2);
        format.setMinimumIntegerDigits(2);
//        format làm tròn số
        format.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println(format.format(l));
        System.out.println(format.format(k));

    }
}
