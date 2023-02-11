package com.syntax.jmasterCoBan.Java46;

/**
 * The type Person.
 */
public class Person {
    /**
     * The Luong co ban.
     */
    public final double LUONG_CO_BAN = 2000000;
    private String name ;

    /**
     * Instantiates a new Person.
     *
     * @param name the name
     */
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
     * Gets luong co ban.
     *
     * @return the luong co ban
     */
    public double getLUONG_CO_BAN() {
        return LUONG_CO_BAN;
    }

    /**
     * Luong double.
     *
     * @return the double
     */
    public double luong()
    { return LUONG_CO_BAN;}

}
