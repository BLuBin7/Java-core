package com.exercise.exercise_1.Ex3;

/**
 * The type My points.
 */
public class MyPoints {
//    Attibute
    private int x = 0;
    private int y = 0;
//    Constructor

    /**
     * Instantiates a new My points.
     *
     * @param x the x
     * @param y the y
     */
    public MyPoints(int x, int y) {
        this.x = x;
        this.y = y;
    }
//   Operation

    /**
     * Gets x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Sets .
     *
     * @param x the x
     * @param y the y
     */
    public void setxy(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoints{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * Distance double.
     *
     * @param x the x
     * @param y the y
     * @return double
     */
    public double distance(int x, int y)
    {
        int xDiff = this.x;
        int yDiff = this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff );
    }

    /**
     * Distanceother double.
     *
     * @param another the another
     * @return the double
     */
    public double distanceother(MyPoints another)
        {
            int xDiff = this.x - another.x;
            int yDiff = this.y - another.y;
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff );
        }
}

