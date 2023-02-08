package com.syntax.jmaster.Java46;

public class Person {
    public final double LUONG_CO_BAN = 2000000;
    private String name ;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLUONG_CO_BAN() {
        return LUONG_CO_BAN;
    }
    public double luong()
    { return LUONG_CO_BAN;}

}
