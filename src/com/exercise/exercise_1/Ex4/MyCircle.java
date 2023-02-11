package com.exercise.exercise_1.Ex4;


/**
 * The type My circle.
 */
public class MyCircle {
    //    Attribute
    private MyPoints center;
    private int radius = 1;

    /**
     * Instantiates a new My circle.
     *
     * @param x      the x
     * @param y      the y
     * @param radius the radius
     */
//    Constructor
    public MyCircle(int x , int y , int radius) {
        super();
        this.radius = radius;
    }

    /**
     * Instantiates a new My circle.
     *
     * @param center the center
     * @param radius the radius
     */
    public MyCircle(MyPoints center, int radius) {
        this.center = center;
        this.radius = radius;
    }


    /**
     * Gets center.
     *
     * @return the center
     */
    public MyPoints getCenter() {
        return center;
    }

    /**
     * Sets center.
     *
     * @param center the center
     */
    public void setCenter(MyPoints center) {
        this.center = center;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets radius.
     *
     * @param radius the radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    /**
     * Gets center x.
     *
     * @return the center x
     */
    public int getCenterX()
    {
        return this.center.getX();
    }

    /**
     * Gets center y.
     *
     * @return the center y
     */
    public int getCenterY()
    {
        return this.center.getY();
    }

    /**
     * Sets center xy.
     *
     * @param x the x
     * @param y the y
     */
    public void setCenterXY(int x,int y ) {
        this.center.setX(x);
        this.center.setY(y);
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}
