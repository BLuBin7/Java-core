package com.syntax.jmasterCoBan.Java61;

/**
 * The type Animal.
 */
public class Animal {

    /**
     * The type Dog.
     */
//    inner class
    public class Dog
    {
        private String ten;

        /**
         * Hello.
         */
        public void hello()
        {
            System.out.println("hello");
        }
    }

    /**
     * The type Husky.
     */
    public class Husky extends Dog
    {

    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal.Dog d = a.new Dog();

        d.hello();
    }
}
