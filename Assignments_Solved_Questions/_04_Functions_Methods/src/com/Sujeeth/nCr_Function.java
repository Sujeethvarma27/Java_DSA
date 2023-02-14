package com.Sujeeth;

import java.util.Scanner;

public class nCr_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n value : ");
        int n = in.nextInt();
        System.out.print("Enter r value : ");
        int r = in.nextInt();

        int ans = nCr(n,r);

        System.out.println("nCr : " +ans);


    }

    static int nCr ( int n , int r ){

        int nCr = Factorial(n)/(Factorial(r)*Factorial(n-r));

        return nCr;
    }

    static int Factorial ( int n ){
        int fact = 1;
        for ( int i = 1 ; i <= n ; i++ ){
            fact *= i;
        }
        return fact ;
    }
}
