package com.exercise.exercise_1.Ex3;

/**
 * The type Test ex 3.
 */
public class testEx3 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MyPoints mp1 = new MyPoints(3,1);
        MyPoints mp2 = new MyPoints(5,7);
        System.out.println(mp1.distance(3,1));
//      khoảng cách từ điểm này tới điểm khác
        System.out.println(mp1.distanceother(mp2));
    }
}
