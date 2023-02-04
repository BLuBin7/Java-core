package com.exercise.exercise_1.Ex1;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle1 = new Circle(1.2,"red");
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea() );
        while(true)
        {
            System.out.println("1. Thay doi mau cua circle ");
            System.out.println("2. Thay doi ban kinh cua circle ");
            System.out.println("3. Exit ");
            int ip = input.nextInt();
            input.nextLine();
            if(ip == 1)
            {
                System.out.println("nhap mau muon doi : ");
                String doimau = input.nextLine();
                circle1.setColor(doimau);
                System.out.println(circle1.toString());
            }
            if(ip == 2)
            {
                System.out.println("nhap ban kinh muon doi : ");
                double bk = input.nextDouble();
                circle1.setRadius(bk);
                System.out.println(circle1.toString());
            }
            if(ip == 3)
            {
                break;
            }
        }
    }
}
