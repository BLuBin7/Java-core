package com.syntax.jmasterCoBan.Java45;

public class Person {
    private String name;
    private Address address;


    //    Constructor 1
    public Person()
    {

    }
//    Constructor 2
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
