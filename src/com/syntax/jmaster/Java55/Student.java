package com.syntax.jmaster.Java55;

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
