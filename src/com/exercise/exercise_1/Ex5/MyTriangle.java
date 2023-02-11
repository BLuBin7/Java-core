package com.exercise.exercise_1.Ex5;

import java.awt.*;

/**
 * The type My triangle.
 */
public class MyTriangle extends MyPoints {
    private MyPoints v1;
    private MyPoints v2;
    private MyPoints v3;

    /**
     * The X 1.
     */
    int x1 = 0;
    /**
     * The Y 1.
     */
    int y1 = 0;
    /**
     * The X 2.
     */
    int x2 = 0;
    /**
     * The Y 2.
     */
    int y2 = 0;
    /**
     * The X 3.
     */
    int x3 = 0;
    /**
     * The Y 3.
     */
    int y3 = 0;

    /**
     * Instantiates a new My triangle.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @param v3 the v 3
     */
    public MyTriangle( MyPoints v1, MyPoints v2, MyPoints v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /**
     * Instantiates a new My triangle.
     *
     * @param x1 the x 1
     * @param y1 the y 1
     * @param x2 the x 2
     * @param y2 the y 2
     * @param x3 the x 3
     * @param y3 the y 3
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

    /**
     * Gets perimeter.
     *
     * @return the perimeter
     */
    public double getPerimeter()
    {
        return v1.distance(x1,y1) + v2.distance(x2,y2) + v3.distance(x3,y3);
    }

}
