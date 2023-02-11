package com.syntax.jmasterCoBan.Java67;

/**
 * The type My exception.
 */
public class MyException extends Exception{
    private String error;

    /**
     * Instantiates a new My exception.
     *
     * @param error the error
     */
    public MyException(String error) {
        this.error = error;
    }

    /**
     * Gets error.
     *
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error the error
     */
    public void setError(String error) {
        this.error = error;
    }
}
