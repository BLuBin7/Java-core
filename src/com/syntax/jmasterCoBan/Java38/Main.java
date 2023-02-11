package com.syntax.jmasterCoBan.Java38;

/**
 * The type Main.
 */
//Java Cơ Bản 38 Sự khác nhau giữa giá trị null và 0 trong Java
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Phim tenphim = null; // null là kiểu dữ liệu trống ( không phải bằng 0)
        tenphim = new Phim("hh");
        System.out.println(tenphim.getTenphim());
    }
}
