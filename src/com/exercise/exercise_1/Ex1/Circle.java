package com.exercise.exercise_1.Ex1;

public class Circle {
//    Attribute
    private double radius;
    private String  color;

//    Constructor

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

//    Operation

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
