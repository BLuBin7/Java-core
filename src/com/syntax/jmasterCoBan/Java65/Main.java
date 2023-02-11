package com.syntax.jmasterCoBan.Java65;
/**
 * Java Cơ Bản 65 try catch bắt lỗi exception trọng Java
 */
public class Main {
    public static void main(String[] args) {
        int[] mang = {1,2};
        try {
            System.out.println(mang[3]);
        }
        catch (Exception e){
            System.out.println("loi" + e);
        }
    }
}
