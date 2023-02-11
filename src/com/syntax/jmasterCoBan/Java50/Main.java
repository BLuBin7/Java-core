package com.syntax.jmasterCoBan.Java50;

/**
 * The type Main.
 */
//Java Cơ Bản 50 Toán Tử instanceof kiểm tra kiểu đối tượng của biến trong Đa hình
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person person = new Person();
//        check kiểu đối tượng xem có tạo từ 1 class worker hay subclass của worker không
        if(person instanceof Worker) {
            ((Worker)person).luong();
        }
        else {
            System.out.println("khong phai worker");
        }

        Person person1 = new Worker();
        if(person1 instanceof Worker) {
            System.out.println("la worker");
        }

    }
}
