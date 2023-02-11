package com.syntax.jmasterCoBan.Java60;

/**
 * The type Person.
 */
public class Person {

    /**
     * The type Kid.
     */
//    inner static class
    public static class Kid
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

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
//    cách gọi inner static class
    public static void main(String[] args) {
        Person.Kid kid = new Person.Kid();
        kid.hello();
    }
}
