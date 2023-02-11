package com.Sujeeth;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        float R = in.nextFloat();

        double area = 3.14*R*R ;  // Calculating area of circle

        System.out.println("Area of circle : " +area);



    }
}
