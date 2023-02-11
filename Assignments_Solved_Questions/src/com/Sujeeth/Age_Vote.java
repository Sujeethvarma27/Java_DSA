package com.Sujeeth;

import java.util.Scanner;

public class Age_Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = in.nextInt();

        if (age > 18){
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
    }
}
