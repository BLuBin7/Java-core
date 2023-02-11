package com.syntax.jmasterCoBan.Java59;

/**
 * The type Person.
 */
public class Person {
    /**
     * Xinchao.
     */
//    truyền phương thức phải ở trong hàm
    public void Xinchao() {
        Kid kid = new Kid();
        kid.hello();
    }
}

/**
 * The type Kid.
 */
//outer class : chỉ có 1 loại là default
class Kid
{
    private int tuoi;

    /**
     * Hello.
     */
    public void hello()
    {
        System.out.println("xin chao");
    }
}
