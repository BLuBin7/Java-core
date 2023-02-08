package com.syntax.jmaster.Java45;

public class Address {
    public String streetname;

//    constructor 1
    public Address()
    {
    }
//    constructor 2
    public Address(String streetname) {
        this.streetname = streetname;
    }

    public String getstreetname() {
        return streetname;
    }

    public void setstreetname(String streetname) {
        this.streetname = streetname;
    }
}
