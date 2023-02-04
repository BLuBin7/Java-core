package com.syntax.Java37;

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
//      phải khai báo Java37 là do class Xinchao có dữ liệu truyền vào là Java37
//      do biến jv37 là 1 đối tượng nên phải khởi tạo nó bằng hàm new
        Java37 jv37 = new Java37();
        Xinchao(jv37);
    }
}
