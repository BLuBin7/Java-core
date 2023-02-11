package com.syntax.jmasterCoBan.Java66;

/**
 * Java Cơ Bản 66 Finally trong Exception
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] mang = {1,2};

        try{
            System.out.println(mang[3]);
        }catch(Exception e){
            System.out.println(e);
        }
        /**
           đúng hay sai thì finally vẫn chạy
         */
        finally{
            System.out.println("finally");
        }
    }
}
