package com.exercise.exercise_1.Ex4;

/**
 * The type Text ex 4.
 */
public class textEx4 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MyPoints p1 = new MyPoints(4,9);

        MyCircle c1 = new MyCircle(p1,8);


        System.out.println(c1.toString());
        System.out.println(c1.getCenterX());

        c1.setCenterXY(6,7);
        System.out.println(c1.toString());

    }
}
