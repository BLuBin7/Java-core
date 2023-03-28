package com.syntax.TITV.Java81.model;

/**
 * Created by Binh
 * Date : 3/27/2023 - 7:57 PM
 * Description :
 */
public class CounterModel {
    private int value;

    /**
     * Instantiates a new Counter model.
     */
    public CounterModel(){
        this.value = 0;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set value.
     *
     * @param value the value
     */
    public void setValue(int value){
        this.value = value;
    }

    /**
     * Increment.
     */
    public void increment(){
        this.value ++;
    }

    /**
     * Decrement.
     */
    public void decrement(){
        this.value --;
    }

    /**
     * Reset.
     */
    public void reset(){
        this.value = 0;
    }

}
