package com.syntax.jmasterCoBan.Java57.Dinhdangngay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Java Cơ Bản - Định dạng ngày Date sang String trong Java
public class Main {
    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy"; // hiển thị ngày

        String pattern2 ="dd/MM/yyyy hh:mm a"; // hiển thị giờ

        String pattern3 = "EEEEE, MMMMM yyyy hh:mm a"; // hiển thị tiếng việt
//        hiển thị giờ quốc tế
//        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern2);
//        hiển thị giờ vn
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern3 ,new Locale("vi","VN"));

        System.out.println(dateFormat.format(new Date()));
    }
}
