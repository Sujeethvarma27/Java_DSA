package com.Sujeeth;

import java.util.Scanner;

public class Area_of_isosceles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter length of same sided : ");
        double a = sc.nextDouble();

        System.out.print("Please enter side2 of isosceles triangle : ");
        double b = sc.nextDouble();

        double area = (b / 4) * Math.sqrt((4 * a * a) - (b * b));
        System.out.println("Area of isosceles triangle is : " + area);
    }
}
