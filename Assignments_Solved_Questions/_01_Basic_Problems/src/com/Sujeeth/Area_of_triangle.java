package com.Sujeeth;

import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base of triangle : ");
        float B = in.nextFloat();

        System.out.print("Enter height of the triangle : ");
        float H = in.nextFloat();

        float Area = (B*H)/2 ;  // Area of equilateral triangle

        System.out.println("Area of triangle : " +Area);
    }
}
