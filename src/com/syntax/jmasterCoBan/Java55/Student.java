package com.syntax.jmasterCoBan.Java55;

/**
 * The type Student.
 */
public class Student implements Person,Teacher{
    @Override
    public void hoc() {
        System.out.println("hoc");
    }

    @Override
    public void ten() {
        System.out.println("ten");
    }
}
