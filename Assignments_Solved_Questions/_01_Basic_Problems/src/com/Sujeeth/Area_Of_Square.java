package com.Sujeeth;

import java.util.Scanner;

public class Area_Of_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of side of Square : ");
        float S = in.nextFloat();

        float area = S*S;

        System.out.println("Area of square : " +area);

    }

}
