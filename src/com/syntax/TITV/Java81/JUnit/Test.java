package com.syntax.TITV.Java81.JUnit;
import com.syntax.TITV.Java81.model.CounterModel;

/**
 * Created by Binh
 * Date : 3/27/2023 - 8:04 PM
 * Description :
 */
public class Test {
    public static void main(String[] args){
        CounterModel ct = new CounterModel();
        ct.increment();
        ct.increment();
        ct.decrement();
        System.out.println(ct.getValue());

    }
}
