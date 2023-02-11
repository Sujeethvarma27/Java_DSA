package com.Sujeeth;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        float P = in.nextFloat();

        System.out.print("Enter Rate of interest per year : ");
        float R = in.nextFloat();

        System.out.print("Enter Time period (in years) : ");
        float T = in.nextFloat();

        float SI = (P*R*T)/100;  // Calculating Simple Interest

        System.out.println("Simple Interest (I) = " +SI);

    }

}
