package com.Sujeeth;


import java.util.Scanner;

public class Armstrong_num {
    // Check whether the given number is Armstrong number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = in.nextInt();
        boolean ans = Armstrong(n);

        System.out.println(ans);

    }

    static boolean Armstrong ( int n ){
        int Original = n ;
        int sum = 0;

        while ( n > 0 ){
            int rem = n % 10 ;
            sum = sum + rem * rem * rem ;
            n = n / 10 ;
        }
        return Original == sum ;
    }
}
