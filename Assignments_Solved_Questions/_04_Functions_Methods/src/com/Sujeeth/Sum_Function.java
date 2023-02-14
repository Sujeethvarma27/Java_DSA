package com.Sujeeth;

import java.util.Scanner;

public class Sum_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = Sum_Of_twoNumbers(a,b);
        System.out.println("Sum of two numbers : " +sum);

    }

    static int Sum_Of_twoNumbers ( int a , int b){
        int sum = a + b;
        return sum;
    }
}
