package com.exercise.exercise_1.Ex1;

/**
 * The type Circle.
 */
public class Circle {
//    Attribute
    private double radius;
    private String  color;

//    Constructor

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     * @param color  the color
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

//    Operation

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets radius.
     *
     * @param radius the radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
