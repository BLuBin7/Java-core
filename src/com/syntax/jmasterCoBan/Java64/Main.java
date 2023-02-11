package com.syntax.jmasterCoBan.Java64;
/**
 * Java Cơ Bản 64 Exception Ngoại lệ trong Java.
 * Exception có 2 loại là : checked và unchecked
 */
public class Main {
    public static void main(String[] args) {
        int[] mang = {1,4};
        System.out.println(mang[3]);
        // ở đây bị error nên nó sẽ throws ra cái exception
    }
}
