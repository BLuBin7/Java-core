package com.exercise.exercise_1.Ex3;

public class MyPoints {
//    Attibute
    private int x = 0;
    private int y = 0;
//    Constructor

    public MyPoints(int x, int y) {
        this.x = x;
        this.y = y;
    }
//   Operation

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
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
    public double distance(int x, int y)
    {
        int xDiff = this.x;
        int yDiff = this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff );
    }
    public double distanceother(MyPoints another)
        {
            int xDiff = this.x - another.x;
            int yDiff = this.y - another.y;
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff );
        }
}
