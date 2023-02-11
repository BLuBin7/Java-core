package com.syntax.jmasterCoBan.Java59;

/**
 * The type Main.
 */
//Java Cơ Bản 59 Outer Class
public class Main extends Kid {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
//    outer class kế thừa được, chỉ kế thừa được khi cùng package
    public static void main(String[] args) {
        Kid kid = new Kid();
        kid.hello();
    }
}
