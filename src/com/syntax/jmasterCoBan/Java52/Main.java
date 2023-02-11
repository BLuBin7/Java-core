package com.syntax.jmasterCoBan.Java52;

/**
 * The type Main.
 */
//Java Cơ Bản 52 Abstract Class trong Java
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//        Person p =new Person(); lớp abstract không thể tạo 1 đối tượng mới nhờ nó
    Employee e = new Employee("a");
//    tương tự , vẫn có thể sử dụng tính đa hình
    Person p = new Employee("b");
    }
}
