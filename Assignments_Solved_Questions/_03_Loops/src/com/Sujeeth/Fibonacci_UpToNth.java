package com.Sujeeth;

import java.util.Scanner;

public class Fibonacci_UpToNth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the n value : ");
        int n = in.nextInt();

        int t1 = 0;
        int t2 = 1;
        int next = t1 + t2;
        System.out.print("Fibonacci series : " +t1 +" " +t2 +" ");

        while ( next <= n ){
            System.out.print(next +" ");
            int temp = t2;
            t1 = t2;
            t2 = next ;
            next = t1 + t2 ;
        }
    }
}
