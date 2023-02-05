package com.syntax.jmaster.Java43;
//Java Cơ Bản 43 Phương thức Override và Overload method trong Java
public class Main {
    public static void main(String[] args) {
        Superclass superclas = new Superclass();
        superclas.tinhtong(5,6);
        superclas.tinhtong(5,6L);
        superclas.tinhtong(5,6,7);

        Subclass subclass = new Subclass();
        subclass.tinhtong(6,3);
    }
}
