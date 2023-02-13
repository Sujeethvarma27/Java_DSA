package com.Sujeeth;

import java.util.Scanner;

public class Factorial_Function {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = in.nextInt();
        int ans = Factorial(a);

        System.out.println("Factorial of given number : " +ans);
    }

    static int Factorial ( int n ){
        int fact = 1;
        for (int i=1;i<=n;i++){
           fact = fact * i;
        }
        return fact;
    }
}
