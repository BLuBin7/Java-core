package com.javacore.syntax;

public class Java37 {
    public void Chuvi()
    {
        System.out.println("chu vi");
    }
    public static void Xinchao(Java37 jv37)
    {
        String s = "xin chao";
        System.out.println(s);
        jv37.Chuvi();
    }
    public static void main(String[] args) {
        int x =10;
        System.out.println(x);
        Java37 jv37 = new Java37();
        Xinchao(jv37);
    }
}
