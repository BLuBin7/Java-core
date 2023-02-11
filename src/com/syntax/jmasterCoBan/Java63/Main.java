package com.syntax.jmasterCoBan.Java63;

/**
 * Java Cơ Bản 63 Anonymous Inner Class
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

//        tạo 1 class implements class interface mà không cần phải tạo 1 file mới
        PersonService p = new PersonService()
        {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        p.hello();
//        lưu ý: phải có dấu " ; "

//        tạo 1 class extends từ class abstract mà không cần tạo 1 file mới
        Xinchao xinchao = new Xinchao()
        {
            @Override
            public void xinchao() {
                System.out.println("xinchao");
            }
        };
//        lưu ý : phải có dấu " ; "
        xinchao.xinchao();
    }
}

/**
 * The type Xinchao.
 */
abstract class Xinchao {
    /**
     * Xinchao.
     */
    public abstract void xinchao();
}
