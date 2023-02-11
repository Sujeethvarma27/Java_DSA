package com.Sujeeth;

import java.util.Scanner;

public class Fibonacci_nth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the nth position :  ");
        int n = in.nextInt();

        int t1 = 0;  // first term = 0
        int t2 = 1;  // second term = 1
        int count = 2;

        while ( count <= n ){
            int temp = t2;
            t2 = t1 + t2;
            t1 = temp;
            count ++;
        }

        System.out.println("Value at nth position of fibonacci series : " +t2);

    }

}
