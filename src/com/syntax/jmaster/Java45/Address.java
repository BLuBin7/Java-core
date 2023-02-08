package com.syntax.jmaster.Java45;

public class Address {
    public String address;

//    constructor 1
    public Address()
    {
    }
//    constructor 2
    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
