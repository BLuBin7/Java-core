package com.syntax.jmasterCoBan.Java45;

/**
 * The type Person.
 */
public class Person {
    private String name;
    private Address address;


    /**
     * Instantiates a new Person.
     */
//    Constructor 1
    public Person()
    {

    }

    /**
     * Instantiates a new Person.
     *
     * @param name the name
     */
//    Constructor 2
    public Person(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
}
