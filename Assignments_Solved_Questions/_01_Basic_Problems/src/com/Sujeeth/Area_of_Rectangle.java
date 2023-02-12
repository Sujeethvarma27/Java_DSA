package com.Sujeeth;

import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle : ");
        float L = in.nextFloat();

        System.out.print("Enter the breadth of the rectangle : ");
        float B = in.nextFloat();

        float Area = L * B;
        System.out.println("Area of rectangle : " +Area);
    }
}
