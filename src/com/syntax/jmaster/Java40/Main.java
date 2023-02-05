package com.syntax.jmaster.Java40;
//Java Cơ Bản 40 Kế thừa trong Java
// Class kế thừa : subclass(class con), class được kế thừa : superclass(class cha)
// superclass có thể có nhiều subclass nhưng subclass chỉ có duy nhất 1 superclass
//lưu ý: trong INTERFACE thì 1 subclass có thể kế thừa nhiều superclass
public class Main {
    public static void main(String[] args) {
        Nhanvien nhanvien = new Nhanvien("©","a");
        Person person = new Nhanvien("a","q");

        System.out.println(nhanvien.getTen());
    }
}
