package com.syntax.jmasterCoBan.Java67;

public class MyException extends Exception{
    private String error;

    public MyException(String error) {
        this.error = error;
    }
    public String getError() {
        return error;
    }

    /**
     *
     * @param error
     */
    public void setError(String error) {
        this.error = error;
    }
}
