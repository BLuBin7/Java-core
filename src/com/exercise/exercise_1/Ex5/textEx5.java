package com.exercise.exercise_1.Ex5;


public class textEx5 {
    public static void main(String[] args) {
        MyPoints v1 = new MyPoints(3,1);
        MyPoints v2 = new MyPoints(4,1);
        MyPoints v3 = new MyPoints(9,1);
        MyTriangle mt = new MyTriangle(v1,v2,v3);
        MyTriangle mt2 = new MyTriangle(1,2,3,4,5,6);

        System.out.println(mt.getPerimeter());

    }
}
