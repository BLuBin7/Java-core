package com.syntax.jmasterCoBan.Java56.Dinhdangtiente;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * The type Main.
 */
//Java Cơ Bản - Định dạng hiển thị tiền tệ trong Java
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        long l = 123456789;

        Locale locale = new Locale("vi","VN");

//        đơn vị tiền tệ
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
//          làm tròn số
        format.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(format.format(l));


        DecimalFormat format2 = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
//        thay đổi đơn vị tiền tệ
        DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
        formatSymbols.setGroupingSeparator('-'); // char nên để trong dấu ' '
        formatSymbols.setCurrencySymbol("vng"); // String nên để trong dấu " "

//        truyền thay đổi vào format2
        format2.setDecimalFormatSymbols(formatSymbols);
        System.out.println(format2.format(l));

    }
}
