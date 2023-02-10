package com.syntax.jmasterCoBan.Java60;

public class Person {

//    inner static class
    public static class Kid
    {
        private int tuoi;

        public void hello()
        {
            System.out.println("xin chao");
        }
    }
//    cách gọi inner static class
    public static void main(String[] args) {
        Person.Kid kid = new Person.Kid();
        kid.hello();
    }
}
