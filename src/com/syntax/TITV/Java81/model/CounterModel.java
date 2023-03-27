package com.syntax.TITV.Java81.model;

/**
 * Created by Binh
 * Date : 3/27/2023 - 7:57 PM
 * Description :
 */
public class CounterModel {
    private int value;

    public CounterModel(){
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void increment(){
        this.value ++;
    }

    public void decrement(){
        this.value --;
    }

    public void reset(){
        this.value = 0;
    }


}
