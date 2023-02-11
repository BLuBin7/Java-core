package com.syntax.jmasterCoBan.Java44;

/**
 * The type Main.
 */
//Java Cơ Bản 44 Quan hệ đối tượng Has A, Kế thừa Is A và Constructor
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
//    có thể tạo nhiều constructor, nhưng nếu nó kế thì class con phải có dạng giống class cha
    public static void main(String[] args) {
        Employee e = new Employee();
        Diachi d = new Diachi();
        d.setTenduong("HCM");

        e.setTen("A");
        e.setDiachi(d);

        System.out.println(e.getTen());
        System.out.println(e.getDiachi().getTenduong());



    }
}
