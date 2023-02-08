package com.syntax.jmaster.Java48;
//Java Cơ Bản 48 Class Object mặc định là cha mọi class trong Java
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
//      class cha của mọi class nên có thể dùng tính đa hình
        Object obj = new Main();
    }
}
