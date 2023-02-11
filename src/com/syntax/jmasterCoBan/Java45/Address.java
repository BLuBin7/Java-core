package com.syntax.jmasterCoBan.Java45;

/**
 * The type Address.
 */
public class Address {
    /**
     * The Streetname.
     */
    public String streetname;

    /**
     * Instantiates a new Address.
     */
//    constructor 1
    public Address()
    {
    }

    /**
     * Instantiates a new Address.
     *
     * @param streetname the streetname
     */
//    constructor 2
    public Address(String streetname) {
        this.streetname = streetname;
    }

    /**
     * Gets .
     *
     * @return the
     */
    public String getstreetname() {
        return streetname;
    }

    /**
     * Sets .
     *
     * @param streetname the streetname
     */
    public void setstreetname(String streetname) {
        this.streetname = streetname;
    }
}
