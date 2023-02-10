package com.syntax.jmasterCoBan.Java59;

public class Person {
//    truyền phương thức phải ở trong hàm
    public void Xinchao() {
        Kid kid = new Kid();
        kid.hello();
    }
}

//outer class : chỉ có 1 loại là default
class Kid
{
    private int tuoi;
    public void hello()
    {
        System.out.println("xin chao");
    }
}
