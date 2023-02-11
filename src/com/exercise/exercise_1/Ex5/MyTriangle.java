package com.exercise.exercise_1.Ex5;

import java.awt.*;

public class MyTriangle extends MyPoints {
    private MyPoints v1;
    private MyPoints v2;
    private MyPoints v3;

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    int x3 = 0;
    int y3 = 0;

    /**
     *
     * @param v1
     * @param v2
     * @param v3
     */

    public MyTriangle( MyPoints v1, MyPoints v2, MyPoints v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }


    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter()
    {
        return v1.distance(x1,y1) + v2.distance(x2,y2) + v3.distance(x3,y3);
    }

}
