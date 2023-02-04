package com.exercise.exercise_1.Ex4;

import com.exercise.exercise_1.Ex3.MyPoints;

public class MyCircle {
    //    Attribute
    private MyPoints center;
    private int radius = 1;

//    Constructor
    public MyCircle(int x , int y , int radius) {
        super();
        this.radius = radius;
    }
    public MyCircle(MyPoints center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoints getCenter() {
        return center;
    }

    public void setCenter(MyPoints center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

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
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}
