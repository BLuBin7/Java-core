package com.syntax.jmasterCoBan.Java61;

public class Animal {

//    inner class
    public class Dog
    {
        private String ten;

        public void hello()
        {
            System.out.println("hello");
        }
    }

    public class Husky extends Dog
    {

    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal.Dog d = a.new Dog();

        d.hello();
    }
}
