package com.exercise.exercise_1.Ex2;

/**
 * The type Author.
 */
public class Author {
//    Attribute
    private String name ;
    private String email ;
    private char gender ;
//    Constructor

    /**
     * Instantiates a new Author.
     *
     * @param name   the name
     * @param email  the email
     * @param gender the gender
     */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
//    Operation

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
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
