package com.syntax.jmaster.Java55;
//Java Cơ Bản 55 Kế thừa Interface trong Java
//interface dùng để đa kế thừa
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Person person = new Student(); // đa hình được
        student.ten(); // implements từ Person
        student.hoc(); // implements từ Teacher
    }
}
