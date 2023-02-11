package com.Sujeeth;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = in.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(num +" * " +i +" = " +num*i);
        }
    }
}
