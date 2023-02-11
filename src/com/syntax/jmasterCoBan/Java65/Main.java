package com.syntax.jmasterCoBan.Java65;
/**
 * Java Cơ Bản 65 try catch bắt lỗi exception trọng Java
 * class Exception là class cha của mọi class, do vậy phải catch ở cuối cùng
 */
public class Main {
    public static void main(String[] args) {
        int[] mang = {1,2};
        try {
            System.out.println(mang[3]);
        }
        catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("error");
        }
        /**
         * class Exception là class cha của mọi class nên phải catch ở cuối cùng
         */
        catch (Exception e){
            System.out.println("loi" + e);
        }
    }
}
