package com.syntax.jmasterCoBan.Java54;

/**
 * The type Dog.
 */
public class Dog implements AnimalService{
    @Override
    public void sua() {
        System.out.println("sua dog");
    }

    @Override
    public void them() {
        System.out.println("them dog");
    }

    @Override
    public void xoa() {
        System.out.println("xoa dog");
    }
}
