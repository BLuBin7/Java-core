package com.syntax.jmasterCoBan.Java67;

/**
 * Java Cơ Bản 67 throw/throws ra một exceptions theo ý muốn
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        try {
            chia2So(1,0);
        }
         //Class MyExcetion(tự tạo) thay vì class Exception mặc định
        catch (MyException e) {
            System.out.println(e.getError());
        }
    }

    /**
     * do throws ra MyException nên ở trên catch MyException lại
     *
     * @param a the a
     * @param b the b
     * @throws MyException the my exception
     */
    public static void chia2So(int a,int b) throws MyException {
        try {
            System.out.println(a / b);
        }
        //muốn throw Exception thì trước tiên phải throws class extends class Exception trước
        //ở đây là MyException
        catch(Exception e){
            throw new MyException("loi chia cho 0");
        }
    }
}
